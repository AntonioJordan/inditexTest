package com.inditex.test.inditex.infrastructure.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "brands")
@Data
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    private List<PriceEntity> prices;
}

//Todo Modo Lazy load aplicar reactividad desde aquí
//Todo Validaciones