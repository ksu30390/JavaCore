package ru.geekbrains.JavaCoreLesson1;

public class Human implements Movable{
    private String name;
    private int maxRun;
    private int maxHeight;

    public Human(String name, int maxRun, int maxHeight) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxHeight = maxHeight;
    }

    public boolean run(int distance) {
        if (distance < maxRun) {
            System.out.println(name + " пробежал ");
            return true;
        } else {
            return false;
        }
    }

    public boolean jump(int height) {
        if (height < maxHeight) {
            System.out.println(name + " перепрыгнул через стену ");
            return true;
        } else {
            return false;
        }
    }

}
