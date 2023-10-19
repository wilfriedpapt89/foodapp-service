package com.crostsoft.foodapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class CustomerOrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String mealDesignation;
    private BigDecimal price;
    @ManyToOne(fetch = FetchType.LAZY)
    private CustomerOrder orderId;
}
