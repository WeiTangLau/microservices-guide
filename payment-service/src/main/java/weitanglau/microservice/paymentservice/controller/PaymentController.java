package weitanglau.microservice.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import weitanglau.microservice.paymentservice.component.Payment;
import weitanglau.microservice.paymentservice.component.PaymentList;
import weitanglau.microservice.paymentservice.service.PaymentService;

import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/api/payment")
    public PaymentList getAllPayments() {
        return paymentService.getAllPayments();
    }
}
