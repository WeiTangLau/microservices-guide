package weitanglau.microservice.customerservice.component;

import java.util.List;

public class PaymentList {
    private List<Payment> payments;

    public PaymentList() {}

    public PaymentList(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
