package com.demo.weather.controller;


import com.demo.weather.service.DemoWeatherService;
import com.demo.weather.domain.Weather;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class WeatherController {
    private static final Logger logger = LoggerFactory.getLogger(WeatherController.class);


    private final DemoWeatherService demoWeatherService;


    @GetMapping("/{zip}")
    public Weather getWeatherDetailsByZipCode(@PathVariable String zip) {

        if (zip.isBlank()) {
            logger.error("Please enter the zip code of the area you are enquiring");
            return null;
        }

        logger.info("Your zip is {}", zip);
        return demoWeatherService.getWeatherDetailsByZipCode(zip);

    }


}
