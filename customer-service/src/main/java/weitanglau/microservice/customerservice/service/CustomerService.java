package weitanglau.microservice.customerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import weitanglau.microservice.customerservice.component.Customer;
import weitanglau.microservice.customerservice.component.OrderList;
import weitanglau.microservice.customerservice.component.PaymentList;

@Service
public class CustomerService {
    @Autowired
    private RestTemplate restTemplate;

    public Customer getCustomerDetails() {
        OrderList orders = restTemplate.getForObject("http://order-service/api/order", OrderList.class);
        PaymentList payments = restTemplate.getForObject("http://payment-service/api/payment", PaymentList.class);
        return new Customer(0, orders, payments);
    }
}
