package ru.geekbrains.JavaCoreLesson3;

import com.sun.org.apache.xpath.internal.operations.Or;

public class LessonThree {
    public static void main(String[] args) {
        Apple[] appleArray = new Apple[3];
        appleArray[0] = new Apple();
        appleArray[1] = new Apple();
        appleArray[2] = new Apple();
        Orange[] orangeArray = new Orange[4];
        orangeArray[0] = new Orange();
        orangeArray[1] = new Orange();
        orangeArray[2] = new Orange();
        orangeArray[3] = new Orange();

Box<Apple> appleBox1 = new Box<>(appleArray);
Box<Orange> orangeBox1 = new Box<>(orangeArray);

        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox1.getWeight());
        System.out.println(appleBox1.compare(orangeBox1));



//appleBox1.getWeightOfBox(appleArray[0].getWeight(), appleArray.length);
//rangeBox1.getWeightOfBox(orangeArray[0].getWeight(), orangeArray.length);
    }

}
