package ru.yandex.practicum.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ManageNumber {
    public List<Number> numberList = new ArrayList<>();

    public List<Number> getNumberList() {
        return numberList;
    }

    public void setNumRandom(int length, int from, int to) {
        if (from < to) {
            System.out.println(" from < to");
            for (int i = 0; i < length; i++) {
                numberList.add(new Number(from + new Random().nextInt(to - from)));
            }
        } else {
            System.out.println("ошибка from > to");
        }
    }

    public void show(int lineLength) {
        int count = 0;
        for (Number number : numberList) {
            System.out.print(number.getValue() + " ");
            count++;
            if (count == lineLength) {
                System.out.println();
                count = 0;
            }
        }
    }

    public void show(int lineLength, List<Number> numberList) {
        int count = 0;
        for (Number number : numberList) {
            System.out.print(number.getValue() + " ");
            count++;
            if (count == lineLength) {
                System.out.println();
                count = 0;
            }
        }
    }
}