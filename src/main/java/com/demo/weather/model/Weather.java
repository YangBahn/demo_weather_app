package com.demo.weather.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Accessors(chain = true)
public class Weather {
    private int humidity;
    private double temp;
    private double windSpeed;
    private LocalDateTime createdAt;
}
