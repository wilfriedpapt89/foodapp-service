package com.crostsoft.foodapp.service;

import com.crostsoft.foodapp.entity.CustomerOrder;
import com.crostsoft.foodapp.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public CustomerOrder createOrder(CustomerOrder order) {
        return orderRepository.save(order);
    }

    @Override
    public CustomerOrder findOrderById(Long orderId) {
        return orderRepository.findById(orderId).get();
    }

    @Override
    public void deleteOrderById(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}
