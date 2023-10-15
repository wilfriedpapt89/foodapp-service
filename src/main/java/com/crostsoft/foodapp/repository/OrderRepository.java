package com.crostsoft.foodapp.repository;

import com.crostsoft.foodapp.entity.Order;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order, Long> {
}
