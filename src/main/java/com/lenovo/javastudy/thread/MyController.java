package com.lenovo.javastudy.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuyu7 on 2019/1/14.
 */
public class MyController {

    private Map<String, String> recordUseMap = new HashMap<>();
    private Map<String, String> recordWhoUseMap = new HashMap<>();
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");

    public void setUse(String modifer, String btcpso) throws Exception {
        String key = modifer + btcpso;
        if (recordUseMap.get(btcpso) == null) {
            recordUseMap.put(btcpso, btcpso);
            recordWhoUseMap.put(key, btcpso);
        } else {
            this.setUseDone(modifer, btcpso);
        }

        System.out.println(key + "完成占用" + format.format(new Date()));
    }

    public void setUnUse(String modifer, String btcpso) throws Exception {
        String key = modifer + btcpso;
        if (recordUseMap.get(btcpso) != null) {
            this.setUnUseDone(modifer, btcpso);
        } else {
            recordUseMap.put(btcpso, null);
            recordWhoUseMap.put(key, null);
        }
        System.out.println(key + "完成解除占用" + format.format(new Date()));
    }

    private void setUseDone(String modifer, String btcpso) throws Exception {
        String key = modifer + btcpso;
        while (true) {
            if (recordUseMap.get(btcpso) == null && recordWhoUseMap.get(key) == null) {
                Thread.sleep(100);
                recordUseMap.put(btcpso, btcpso);
                recordWhoUseMap.put(key, btcpso);
                break;
            }
        }
    }

    private void setUnUseDone(String modifer, String btcpso) throws Exception {
        String key = modifer + btcpso;
        while (true) {
            if (recordUseMap.get(btcpso) != null && recordWhoUseMap.get(key) != null) {
                Thread.sleep(100);
                recordUseMap.put(btcpso, null);
                recordWhoUseMap.put(key, null);
                break;
            }
        }
    }
}
