package ru.geekbrains.JavaCoreLesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

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
                .build();

       
        Request request = new Request.Builder()
                .url(url)
                .build();

       
        Response response = client.newCall(request).execute();

        
        String body = response.body().string();

        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.print(body);








    }
}
