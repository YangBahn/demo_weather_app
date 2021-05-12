# demo_weather_app

**Build Jar**
mvn package spring-boot:repackage

**Run Jar Locally**
from the jar output folder ( ~/target )
java -jar weather-0.0.1-SNAPSHOT-spring-boot.jar

**API**
http://localhost:8081/api/{zipCode}

**Response Example**
{
    "humidity": 30,
    "temp": 292.43,
    "windSpeed": 1.34,
    "createdAt": "2021-05-12T16:35:34.505213"
}
