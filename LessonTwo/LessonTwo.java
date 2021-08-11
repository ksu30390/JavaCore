package ru.geekbrains.JavaCoreLesson2;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class LessonTwo {
    public static void main(String args[]) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "3"}
        };
        String[][] WrongSizeArray1 = {
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "3"}
        };
        String[][] WrongSizeArray2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };
        String[][] WrongDataArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "a"}
        };

        List<String[][]> arrays = new ArrayList<String[][]>();
                arrays.add(correctArray);
                arrays.add(WrongSizeArray1);
                arrays.add(WrongSizeArray2);
                arrays.add(WrongDataArray);

        for (String[][] array : arrays)
        try {
            System.out.println("Сумма элементов массива = " + myMethod(array));;;
        } catch (MyArraySizeException e) {
            System.out.println("Неверный размер массива");
        } catch (MyArrayDataException e) {
            System.out.println("Неверные данные массива в ячейке " + e.i + "*" + e.j);
        }
    }

    public static int myMethod(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }

}







