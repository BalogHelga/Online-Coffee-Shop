package com.proiect.Coffee_Shop.controller;

import com.proiect.Coffee_Shop.module.Order;
import com.proiect.Coffee_Shop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value="/api/orders", produces="application/json", method={RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST})
@CrossOrigin
public class OrderController {
    private OrderService orderService;

    @Autowired
    private OrderController(OrderService orderService) {
        super();
        this.orderService = orderService;
    }

    @GetMapping("/getAll")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping("/addOrder")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
        System.out.println(order);
        return new ResponseEntity<Order>(orderService.saveOrder(order), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteOrder/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable("id") int productID) {
        orderService.deleteOrder(productID);
        return new ResponseEntity<String>("Product deleted successfully", HttpStatus.OK);
    }


}
