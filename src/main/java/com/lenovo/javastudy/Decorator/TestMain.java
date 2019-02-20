

/**
 * Created by liuyu on 2018/5/5.
 */
public class TestMain {

    public static void main(String[] args) {

        Order order = new SalesOrder();
        order = new HeaderPrint(new FooterPrint(order));
        order.print();
    }
}
