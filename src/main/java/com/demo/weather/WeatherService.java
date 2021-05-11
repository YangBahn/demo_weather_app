package com.demo.weather;

import org.json.JSONObject;


public interface WeatherService {

    JSONObject getWeatherDetailsByZipCode(String zip, String appId);
}
