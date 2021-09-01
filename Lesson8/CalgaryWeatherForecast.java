package ru.geekbrains.JavaCoreLesson6;

public class CalgaryWeatherForecast {
    private final String localDate;
    private final String weatherText;
    private final Double temperature;


    public CalgaryWeatherForecast(String localDate, String weatherText, Double temperature) {
        this.localDate = localDate;
        this.weatherText = weatherText;
        this.temperature = temperature;


    }
    @Override
    public String toString() {
        return "CalgaryWeatherForecast{" +
                "localDate='" + localDate + '\'' +
                ", weatherText='" + weatherText + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
