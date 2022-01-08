package com.proiect.Coffee_Shop.service;

import com.proiect.Coffee_Shop.module.Order;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface OrderService {
    Order saveOrder(Order order);
    void deleteOrder(int id);
    List<Order> getAllOrders();
}
