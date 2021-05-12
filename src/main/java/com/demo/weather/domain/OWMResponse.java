package com.demo.weather.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class OWMResponse {
    private Main main;
    private Wind wind;

    @Getter
    public static class Main {
        private int humidity;
        private double temp;

    }
    @Getter
    public static class Wind {
        private double speed;
    }
}
