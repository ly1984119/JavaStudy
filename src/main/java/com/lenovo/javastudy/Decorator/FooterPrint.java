/**
 * Created by liuyu on 2018/5/5.
 */
public class FooterPrint extends OrderDecorator {

    public FooterPrint(Order order) {
        super(order);
    }

    public void print() {
        super.order.print();
        this.footerPrint();
    }

    public void footerPrint() {
        System.out.println("FooterPrint class print");
    }
}
