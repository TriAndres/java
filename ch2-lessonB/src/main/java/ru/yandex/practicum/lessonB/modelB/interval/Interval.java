package ru.yandex.practicum.lessonB.modelB.interval;

public class Interval {
    private final int length;
    private final int from;
    private final int to;

    public Interval(int length,int from, int to) {
        this.length = length;
        this.from = from;
        this.to = to;
    }

    public void showValues(String values) {
        for (int i = 1; i <= length; i++) {
            switch (values) {
                case "(n,m]":
                    if (i > from && i <= to) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print("." + " ");
                    }
                    break;
                case "[n,m)":
                    if (i >= from && i < to) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print("." + " ");
                    }
                    break;
                case "(n,m)":
                    if (i > from && i < to) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print("." + " ");
                    }
                    break;
                case "[n,m]":
                    if (i >= from && i <= to) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print("." + " ");
                    }
                    break;
                default:
                    System.out.print("такой команды нет.");
            }
        }
    }
}