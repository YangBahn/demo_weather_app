package com.demo.weather;


import lombok.AllArgsConstructor;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@AllArgsConstructor
@RestController
@RequestMapping("/weather")
public class WeatherController {
    private static final Logger Log = LoggerFactory.getLogger(WeatherController.class);


    private final WeatherService weatherService;


    @GetMapping("/{zip}&{appId}")
    public ResponseEntity<?> getWeatherDetailsByZipCode(@PathVariable String zip, @PathVariable String appId) {


        JSONObject jsonObj = weatherService.getWeatherDetailsByZipCode(zip, appId);

        if (Objects.isNull(jsonObj)) {
            return new ResponseEntity<Object>("No Response from API", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<String>(jsonObj.toString(), HttpStatus.OK);
    }

}
