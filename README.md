# demo_weather_app
 <br />
 

For convenience, I built + pushed a docker image of this repository to Docker Hub repository<br />
https://hub.docker.com/repository/docker/kevinyang8398/demo-weather-app

**To Run the image:**<br />
1. Install Docker if not done yet
2. To download docker image from hub ```docker pull kevinyang8398/demo-weather-app:latest```
3. Then run the image ```docker run -p 8081:8081 kevinyang8398/demo-weather-app```
<br />

**REST call Example** <br />
```http://localhost:8081/api/{zipCode}```

**Response** <br />
```
{
    "humidity": 30,
    "temp": 292.43,
    "windSpeed": 1.34,
    "createdAt": "2021-05-12T16:35:34.505213"
}
```
