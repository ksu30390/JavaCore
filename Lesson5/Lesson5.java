package ru.geekbrains.JavaCoreLesson5;

import java.io.*;

public class Lesson5 {
    public static void main(String[] args) {

        String[] header = new String[]{"Value1", "Value2", "Value3"};
        int[][] data = new int[][]{{100, 200, 123}, {300, 400, 500}};
        AppData testAppOut = new AppData(header, data);
        File file = new File("src/main/java/ru/geekbrains/JavaCoreLesson5/demo.txt");

        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(file))) {
            objOut.writeObject(testAppOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
        AppData testAppIn = null;
        try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("src/main/java/ru/geekbrains/JavaCoreLesson5/demo.txt"))) {
            testAppIn = (AppData) objIn.readObject();
            testAppIn.info();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



