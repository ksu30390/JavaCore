package ru.geekbrains.JavaCoreLesson2try2;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Orange extends Fruit{
    private double weight = 1.5;

    public Orange(double weight) {
        super(weight);
    }
    public Orange() {};

    @Override
    public double getWeight() {
        return weight;
    }
}
