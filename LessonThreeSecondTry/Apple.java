package ru.geekbrains.JavaCoreLesson2try2;

public class Apple extends Fruit {
    private double weight = 1.0;

    public Apple(double weight) {
        super(weight);
    }
    public Apple() {
        super();
    };

    @Override
    public double getWeight() {
        return weight;
    }
}
