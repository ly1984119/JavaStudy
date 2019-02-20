/**
 * Created by liuyu on 2018/5/5.
 */
public class OrderDecorator extends Order {

    protected Order order;

    public OrderDecorator(Order order) {
        this.order = order;
    }

    public void print() {
        super.print();
    }
}
