package ru.geekbrains.JavaCoreLesson2try2;

import java.util.ArrayList;
import java.util.List;

public class LessonTree {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println(appleBox.getWeightOfBox());
        System.out.println(orangeBox.getWeightOfBox());
        System.out.println(appleBox.compare(orangeBox));

    }
}
