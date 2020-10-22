package weitanglau.microservice.orderservice.component;

import java.util.List;

public class OrderList {
    private List<Order> orders;

    public OrderList(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
