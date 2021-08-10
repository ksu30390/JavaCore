package ru.geekbrains.JavaCoreLesson1;

public class Wall implements Obstacles{
    public int height;


public Wall(int height) {
    this.height = height;
}
public int getNumber() {
    return height;
}
}
