package com.demo.weather.service;

import com.demo.weather.OpenWeatherMapClient;
import com.demo.weather.domain.OWMResponse;
import com.demo.weather.domain.Weather;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;


@Service
@AllArgsConstructor
public class DemoWeatherService {

    private final OpenWeatherMapClient openWeatherMapClient;


    @Cacheable("weather")
    public Weather getWeatherDetailsByZipCode(String zip) {

        Weather weather = null;
        try {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000 * 5);

            OWMResponse response = openWeatherMapClient.get(zip);
            weather = new Weather()
                    .setHumidity(response.getMain().getHumidity())
                    .setTemp(response.getMain().getTemp())
                    .setWindSpeed(response.getWind().getSpeed());
        } catch (JsonProcessingException | UnsupportedEncodingException | InterruptedException e) {
            e.printStackTrace();
        }
        return weather;
    }
}
