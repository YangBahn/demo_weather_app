package com.demo.weather;

import com.demo.weather.model.OWMResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.UnsupportedEncodingException;

@Component
public class OpenWeatherMapClient {

    @Value("${owm.api.key:809f761fd91b3990cdc45262b01aa174}")
    private String apiKey;

    public OWMResponse get(String zip) throws JsonProcessingException, UnsupportedEncodingException {
        return new RestTemplate().getForEntity(buildUri(zip), OWMResponse.class).getBody();
    }


    private String buildUri(String zip) {

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("api.openweathermap.org")
                .path("/data/2.5/weather")
                .queryParam("appid", apiKey)
                .queryParam("zip", zip)
                .build();

        return uriComponents.toUriString();
    }


}
