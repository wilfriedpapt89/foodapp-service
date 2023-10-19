package com.crostsoft.foodapp.repository;

import com.crostsoft.foodapp.entity.CustomerOrder;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<CustomerOrder, Long> {
}
