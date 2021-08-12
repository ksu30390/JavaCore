package ru.geekbrains.JavaCoreLesson2try2;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    private ArrayList<T> fruitList;

    private double weightOfBox;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public ArrayList<T> getFruitList(){
        return fruitList;
    }
    public void addFruit(T fruit) {
        fruitList.add(fruit);

        weightOfBox = weightOfBox + fruit.getWeight();
    }
    public double getWeightOfBox() {
        return weightOfBox;
    }
    public boolean compare(Box<?> another){
        return Math.abs(this.getWeightOfBox() - another.getWeightOfBox()) < 0.0001;

    }
    }
