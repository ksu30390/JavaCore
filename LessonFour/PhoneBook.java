package ru.geekbrains.JavaCoreLesson4;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class PhoneBook {

    private Map<String, ArrayList<String>> phoneBook = new HashMap<>();
    private ArrayList<String> phoneNumberList;

    public void add(String lastname, String phoneNumber) {
        if (phoneBook.containsKey(lastname)) {
            phoneNumberList = phoneBook.get(lastname);
            phoneNumberList.add(phoneNumber);
            phoneBook.put(lastname, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            phoneBook.put(lastname, phoneNumberList);
        }
    }

    public ArrayList<String> get(String lastname) {
        return phoneBook.get(lastname);

    }
}
