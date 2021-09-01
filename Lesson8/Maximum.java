package ru.geekbrains.JavaCoreLesson6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Maximum {
    @JsonProperty("Value")
    private double value;

    public Maximum() {}

    public Maximum(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;

    }

    @Override
    public String toString() {
        return "Maximum{" +
                "value=" + value +
                '}';
    }
}
