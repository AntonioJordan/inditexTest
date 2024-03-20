package com.inditex.test.inditex.infrastructure.repositories;

import com.inditex.test.inditex.application.ports.output.PriceRepositoryAdapter;
import com.inditex.test.inditex.infrastructure.entities.PriceEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class JpaPriceRepositoryAdapter implements PriceRepositoryAdapter {

    PriceRepository priceRepository;

    public JpaPriceRepositoryAdapter(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

}
