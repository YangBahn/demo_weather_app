# demo_weather_app
 <br />
 
**Build Jar** <br />
```mvn package spring-boot:repackage```
 <br />
 <br />

**Run Jar Locally** <br />
From the jar output folder ( ~/target ) <br />
```java -jar weather-0.0.1-SNAPSHOT-spring-boot.jar```
 <br />
  <br />
  
**API** <br />
```http://localhost:8081/api/{zipCode}```

**Response Example** <br />
```
{
    "humidity": 30,
    "temp": 292.43,
    "windSpeed": 1.34,
    "createdAt": "2021-05-12T16:35:34.505213"
}
```
