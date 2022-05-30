package com.zikozee.msscjacksonexamples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author: Ezekiel Eromosei
 * @created: 30 May 2022
 */

@ActiveProfiles("snake") // this wires in our application-snake.yml
@JsonTest
public class BeerDtoSnakeTest extends BaseTest {

    @Test
    void testSnake() throws Exception{
        BeerDto dto = getDto();

        String json = objectMapper.writeValueAsString(dto);

        System.out.println(json);
    }
}
