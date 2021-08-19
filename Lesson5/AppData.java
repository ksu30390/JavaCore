package ru.geekbrains.JavaCoreLesson5;

import java.io.Serializable;

public class AppData implements Serializable {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void info() {
        for (int i = 0; i < header.length - 1; i++) {
            System.out.print(header[i] + ";");
        }
        int i = header.length - 1;
        System.out.println(header[i]);


        for (int k = 0; k < data.length; k++) {
            for (int l = 0; l < data[k].length - 1; l++) {
                System.out.print(data[k][l] + ";");
            }
            int l = data[k].length - 1;
            System.out.println(data[k][l]);

        }

    }
}
