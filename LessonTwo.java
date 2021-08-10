package ru.geekbrains.JavaCoreLesson2;


import java.sql.SQLOutput;

public class LessonTwo {
    public static void main(String args[]) {
        String[][] Array = new String[][]{{"1", "2", "3", "4"},
                {"1", "2", "3", "4"}, {"1", "2", "3", "4"},
                {"1", "2", "3", "3"}};
        try {
            int number = myMethod(Array);
            System.out.println(number);
        } catch (MyArraySizeException e) {
            System.out.println("Неверный размер массива");
        } catch (MyArrayDataException e) {
            System.out.println("Неверные данные массива в ячейке " + e.i + "*" + e.j);
        }
    }

    public static int myMethod(String[][] Array) throws MyArraySizeException, MyArrayDataException {
        if (Array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < Array.length; i++) {
            if (Array[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(Array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }

}







