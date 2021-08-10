package ru.geekbrains.JavaCoreLesson1;

public class RunningTrack implements Obstacles {
    public int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    public int getNumber() {
        return distance;
    }
}
