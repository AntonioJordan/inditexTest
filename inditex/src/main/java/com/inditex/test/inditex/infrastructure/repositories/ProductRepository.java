package com.inditex.test.inditex.infrastructure.repositories;

import com.inditex.test.inditex.domain.models.Price;
import com.inditex.test.inditex.infrastructure.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
}
