package com.inditex.test.inditex.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "prices")
@Data
public class PriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "price_list")
    private Integer priceList;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "price")
    private BigDecimal amount;

    @Column(name = "curr")
    private String currency;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private BrandEntity brand;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;
}

//Todo Modo Lazy load aplicar reactividad desde aquí
//Todo Validaciones

//Price on bd must be named Amount