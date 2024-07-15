package ru.practiicum.option.model.number;

import java.util.Random;

public class Number {
    private final int value;
    private int[] num;

    public Number(int value) {
        this.value = value;
    }

    public void init() {
        num = new int[value];
    }

    public void setNumRandom() {
        for (int i = 0; i < num.length; i++) {
            num[i] = new Random().nextInt(100);
        }
    }

    public void show(int length) {
        int count = 0;
        for (int i : num) {
            System.out.print(i + " ");
            count++;
            if (count == length) {
                System.out.println();
                count = 0;
            }
        }
    }
}