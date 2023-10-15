package com.crostsoft.foodapp.service;

import com.crostsoft.foodapp.entity.Order;

public interface OrderService {

    Order createOrder(Order order);
    Order findOrderById (Long orderId);
    void deleteOrderById(Long orderId);

}
