package com.inditex.test.inditex.application.usecases.mappers;

import com.inditex.test.inditex.application.ports.input.PriceMapperUseCase;
import com.inditex.test.inditex.domain.models.Price;
import com.inditex.test.inditex.infrastructure.controllers.dto.requestdtos.PriceResponseDto;
import org.springframework.stereotype.Component;

@Component
public class PriceMapperUseCaseImpl implements PriceMapperUseCase {

    @Override
    public PriceResponseDto toDto(Price price) {
           return PriceResponseDto.builder()
                .brandId(price.getBrandId())
                .startDate(price.getStartDate())
                .endDate(price.getEndDate())
                .priceList(price.getPriceList())
                .productId(price.getProductId())
                .finalPrice(price.getAmount())
                .build();
    }
}

//Todo, no me fío de los campos, parece que hay que hacer un calculo más profundo con el precio y los
//campos puede que no sean esos.