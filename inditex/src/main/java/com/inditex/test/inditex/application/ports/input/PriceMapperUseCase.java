package com.inditex.test.inditex.application.ports.input;

import com.inditex.test.inditex.domain.models.Price;
import com.inditex.test.inditex.infrastructure.controllers.dto.requestdtos.PriceResponseDto;

public interface PriceMapperUseCase {
    PriceResponseDto toDto(Price price);
}
