package com.inditex.test.inditex.infrastructure.controllers;

import com.inditex.test.inditex.application.services.ProductPriceService;
import com.inditex.test.inditex.infrastructure.controllers.dto.requestdtos.PriceResponseDto;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("/prices")
public class PriceController {

    private final ProductPriceService productPriceService;

    public PriceController(ProductPriceService productPriceService) {
        this.productPriceService = productPriceService;
    }

    @GetMapping
    public ResponseEntity<PriceResponseDto> getProductPrice(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date,
                                                            @RequestParam("productId") Long productId,
                                                            @RequestParam("brandId") Long brandId) {

        Optional<PriceResponseDto> priceDto = productPriceService.getPrice(productId, brandId, date);

        return priceDto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
