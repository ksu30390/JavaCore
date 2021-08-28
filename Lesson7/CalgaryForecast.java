package ru.geekbrains.JavaCoreLesson6;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.sql.SQLOutput;

public class CalgaryForecast {

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("52479")
                .addQueryParameter("apikey", "70Hl5xKPmRRZSnBX7JFGfm16nHbQhgAL")
                .addQueryParameter("metric", "true")
                .build();

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        String body = response.body().string();
       
        ObjectMapper mapper = new ObjectMapper();

        CalgaryWeather calgaryWeather = mapper.readValue(body,CalgaryWeather.class);

for (DailyForecast forecast : calgaryWeather.getDailyForecasts()) {
    System.out.printf("The weather in Calgary on the date %s:\n" +
            "%s with max temperature of %s C\n\n",
            forecast.getDate(),
            forecast.getDay().getWeatherDescription(),
            forecast.getTemperature().getMaximum().getValue());}
}


    }

