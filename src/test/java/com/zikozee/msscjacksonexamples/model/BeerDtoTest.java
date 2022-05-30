package com.zikozee.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest{

    @Test
    void  testSerializeDto() throws Exception{

        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);

    }

    @Test
    void testDeserializeDto() throws JsonProcessingException {

        String json = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":\"12.99\",\"createdDate\":\"2022-05-30T21:12:40+0100\",\"lastUpdatedDate\":\"2022-05-30T21:12:40.9617732+01:00\",\"myLocalDate\":\"20220530\",\"beerId\":\"89e77f85-ac9b-49dc-a6da-cded7223f681\"}\n";
        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);
        System.out.println(beerDto);
    }
}