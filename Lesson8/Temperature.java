package ru.geekbrains.JavaCoreLesson6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature {
    @JsonProperty("Maximum")
    private Maximum maximum;

    public  Temperature() {}

    public Temperature(Maximum maximum) {
        this.maximum = maximum;
    }

    public Maximum getMaximum() {
        return maximum;
    }

    public void setMaximum(Maximum maximum) {
        this.maximum = maximum;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "maximum=" + maximum +
                '}';
    }
}
