package com.zikozee.msscjacksonexamples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * @author: Ezekiel Eromosei
 * @created: 28 May 2022
 */

public class BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    BeerDto getDto(){
        return BeerDto.builder()
                .beerName("BeerName")
                .beerStyle("Ale")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(BigDecimal.valueOf(12.99))
                .upc(123123123123L)
                .myLocalDate(LocalDate.now())
                .build();
    }
}
