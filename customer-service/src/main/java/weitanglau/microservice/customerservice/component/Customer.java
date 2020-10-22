package weitanglau.microservice.customerservice.component;

import java.util.List;

public class Customer {
    private int id;
    private OrderList orders;
    private PaymentList payments;

    public Customer(int id, OrderList orders, PaymentList payments) {
        this.id = id;
        this.orders = orders;
        this.payments = payments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderList getOrders() {
        return orders;
    }

    public void setOrders(OrderList orders) {
        this.orders = orders;
    }

    public PaymentList getPayments() {
        return payments;
    }

    public void setPayments(PaymentList payments) {
        this.payments = payments;
    }
}
