package com.inditex.test.inditex.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "products")
@Data
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private String description;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<PriceEntity> prices;

}
//Todo Modo Lazy load aplicar reactividad desde aquí
//Todo Validaciones