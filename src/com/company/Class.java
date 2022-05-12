package com.company;

import java.util.Arrays;

public class Class {
    private int num;
    private String word;
    private int[] massiv;

    public Class(){}

    public Class(int num, String word, int[] massiv) {
        this.num = num;
        this.word = word;
        this.massiv = massiv;
    }

    @Override
    public String toString() {
        return "Class{" +
                "num=" + num +
                ", word='" + word + '\'' +
                ", massiv=" + Arrays.toString(massiv) +
                '}';
    }
}
