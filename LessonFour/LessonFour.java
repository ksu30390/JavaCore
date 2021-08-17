package ru.geekbrains.JavaCoreLesson4;

import com.sun.javafx.collections.MappingChange;

import java.sql.SQLOutput;
import java.util.*;

public class LessonFour {
    public static void main(String[] args) {
        //Задание 1
       ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Cat", "Dog", "Squirrel", "Cow",
                "Owl", "Cat", "Bunny", "Dog", "Cat", "Rooster"));

        System.out.println(stringArray);
// Выводим неповторяющиеся слова
        Set<String> stringHashSet = new HashSet<>(stringArray);

        System.out.println(stringHashSet);
// Выводим количество каждого из слов
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : stringArray) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        System.out.println(wordsCount.entrySet());

       //Здание 2.

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Никулина", "+79851111111");
        phoneBook.add("Иванов", "+79852222222");
        phoneBook.add("Петров", "+79853333333");
        phoneBook.add("Сидоров", "+79854444444");
        phoneBook.add("Никулина", "+79855555555");
        phoneBook.add("Хвостов", "+79851234567");

        System.out.println(phoneBook.get("Иванов"));
        System.out.println(phoneBook.get("Никулина"));

    }
}
