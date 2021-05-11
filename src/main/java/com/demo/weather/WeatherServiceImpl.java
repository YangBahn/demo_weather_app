package com.demo.weather;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.stereotype.Service;

import static java.util.Arrays.asList;

/*
which takes a zip code as an argument and returns the current temperature, humidity,
and wind speed for that zip code pulled from the open weather api
*/

@Service
public class WeatherServiceImpl implements WeatherService, CacheManagerCustomizer<ConcurrentMapCacheManager> {
    @Override
    public void customize(ConcurrentMapCacheManager cacheManager) {
        cacheManager.setCacheNames(asList("users", "transactions"));
    }


    @Override
    public JSONObject getWeatherDetailsByZipCode(String zip, String appId) {
        return null;
    }
}
