package com.crostsoft.foodapp.service;

import com.crostsoft.foodapp.entity.CustomerOrder;

public interface OrderService {

    CustomerOrder createOrder(CustomerOrder order);
    CustomerOrder findOrderById (Long orderId);
    void deleteOrderById(Long orderId);

}
