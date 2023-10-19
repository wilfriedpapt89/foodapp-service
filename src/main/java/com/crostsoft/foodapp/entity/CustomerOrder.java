package com.crostsoft.foodapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreationTimestamp
    private OffsetDateTime createdAt;
    @OneToMany(mappedBy = "orderId",fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<CustomerOrderDetail> orderDetails = new HashSet<>();
    private BigDecimal total;
    private BigDecimal qty;
}
