package com.demo.weather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


@AllArgsConstructor
public class OpenWeatherMapClient {
    private final String apiKey = "809f761fd91b3990cdc45262b01aa174";

    private final RestTemplate restTemplate;

    private final String owmUrl = "http://localhost:8080/spring-rest/foos";

    public JSONObject get() throws JsonProcessingException {

        ResponseEntity<String> response = restTemplate.getForEntity(owmUrl + "/1", String.class);
//        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.getBody());
        JsonNode name = root.path("name");
//        assertThat(name.asText(), notNullValue());
        return null;
    }

}
