package weitanglau.microservice.customerservice.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import weitanglau.microservice.customerservice.component.Customer;
import weitanglau.microservice.customerservice.service.CustomerService;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/api/customer")
    public Customer getCustomerDetails() {
        return customerService.getCustomerDetails();
    }
}
