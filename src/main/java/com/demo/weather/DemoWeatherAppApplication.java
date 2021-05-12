package com.demo.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class DemoWeatherAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWeatherAppApplication.class, args);
	}

}
