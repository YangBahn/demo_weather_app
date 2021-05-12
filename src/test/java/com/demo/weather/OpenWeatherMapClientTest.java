package com.demo.weather;

import org.junit.jupiter.api.Test;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import static org.junit.jupiter.api.Assertions.*;


class OpenWeatherMapClientTest {

    @Test
    public void urlBuilderTest() {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("api.openweathermap.org")
                .path("/data/2.5/weather")
                .queryParam("apiid", "809f761fd91b3990cdc45262b01aa174")
                .queryParam("zip", "11373")
                .build();

        assertEquals("http://api.openweathermap.org/data/2.5/weather?apiid=809f761fd91b3990cdc45262b01aa174&zip=11373",
                uriComponents.toUri().toString());

    }

}