package com.inditex.test.inditex.infrastructure.repositories;

import com.inditex.test.inditex.domain.models.Price;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface PriceRepository extends CrudRepository<Price, Long> {
    Optional<Price> findByProductIdAndBrandIdAndDate(Long productId, Long brandId, LocalDateTime date);
}
