package com.demo.weather.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Weather {
    private int humidity;
    private double temp;
    private double windSpeed;
}
