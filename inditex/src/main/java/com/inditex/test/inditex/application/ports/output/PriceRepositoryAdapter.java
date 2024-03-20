package com.inditex.test.inditex.application.ports.output;

import com.inditex.test.inditex.domain.models.Price;
import java.util.Optional;

public interface PriceRepositoryAdapter {
    Optional<Price> findById(Long id);
}
