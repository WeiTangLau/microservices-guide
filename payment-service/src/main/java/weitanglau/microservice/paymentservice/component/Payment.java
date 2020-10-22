package weitanglau.microservice.paymentservice.component;

import org.springframework.stereotype.Component;

public class Payment {
    private int id;
    private double value;

    public Payment(int id, double value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
