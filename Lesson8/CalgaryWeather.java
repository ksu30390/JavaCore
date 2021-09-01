package ru.geekbrains.JavaCoreLesson6;

import com.fasterxml.jackson.annotation.*;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CalgaryWeather {
    @JsonProperty("DailyForecasts")
    private List<DailyForecast> dailyForecasts;

    public CalgaryWeather(){}

    public CalgaryWeather(List<DailyForecast> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;
    }

    public List<DailyForecast> getDailyForecasts() {
        return dailyForecasts;
    }



    public void setDailyForecasts(List<DailyForecast> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;

    }
    @Override
    public String toString() {
        return "CalgaryWeather{" +
                "dailyForecasts=" + dailyForecasts +
                '}';
    }
}
