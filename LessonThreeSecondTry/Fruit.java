package ru.geekbrains.JavaCoreLesson2try2;

public abstract class Fruit {
    private double weight;

    public Fruit(){};

    public Fruit(double weight) {
        this.weight = weight;
    }

    public abstract double getWeight();
}
