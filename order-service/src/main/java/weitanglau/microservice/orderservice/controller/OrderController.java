package weitanglau.microservice.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import weitanglau.microservice.orderservice.component.Order;
import weitanglau.microservice.orderservice.component.OrderList;
import weitanglau.microservice.orderservice.service.OrderService;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/api/order")
    public OrderList getAllOrders() {
        return orderService.getAllOrders();
    }
}
