package com.inditex.test.inditex.application.usecases;

import com.inditex.test.inditex.application.ports.input.PriceMapperUseCase;
import com.inditex.test.inditex.application.ports.input.RetriveProductPriceUseCase;
import com.inditex.test.inditex.domain.models.Price;
import com.inditex.test.inditex.infrastructure.controllers.dto.requestdtos.PriceResponseDto;
import com.inditex.test.inditex.infrastructure.repositories.PriceRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public class RetriveProductPriceUseCaseImpl implements RetriveProductPriceUseCase {

    private final PriceRepository priceRepository;
    private final PriceMapperUseCase priceMapper;

    public RetriveProductPriceUseCaseImpl(PriceRepository priceRepository, PriceMapperUseCase priceMapper) {
        this.priceRepository = priceRepository;
        this.priceMapper = priceMapper;
    }

    @Override
    public Optional<PriceResponseDto> getPrice(Long productId, Long brandId, LocalDateTime date) {
        Optional<Price> priceOptional = priceRepository.findByProductIdAndBrandIdAndDate(productId, brandId, date);
        return priceOptional.map(priceMapper::toDto);
    }
}