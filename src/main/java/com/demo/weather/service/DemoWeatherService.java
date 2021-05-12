package com.demo.weather.service;

import com.demo.weather.OpenWeatherMapClient;
import com.demo.weather.model.OWMResponse;
import com.demo.weather.model.Weather;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;


@Service
@AllArgsConstructor
public class DemoWeatherService {

    private final OpenWeatherMapClient openWeatherMapClient;


    @Cacheable("weather")
    public Weather getWeatherDetailsByZipCode(String zip) {

        Weather weather = null;
        try {

            OWMResponse response = openWeatherMapClient.get(zip);
            weather = new Weather()
                    .setHumidity(response.getMain().getHumidity())
                    .setTemp(response.getMain().getTemp())
                    .setWindSpeed(response.getWind().getSpeed())
            .setCreatedAt(LocalDateTime.now());
        } catch (JsonProcessingException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return weather;
    }
}
