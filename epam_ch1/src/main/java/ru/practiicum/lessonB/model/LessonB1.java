package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;

import java.util.List;
import java.util.stream.Collectors;

public class LessonB1 extends LessonB {

    public LessonB1(ManageNumber number) {
        super(number);
    }

    @Override
    public void game() {
        System.out.println("1. Четные и нечетные числа.");
        numAllShow(20, 1, 100, 5);
        System.out.println("Четные числа:");
        evenNumbers();
        System.out.println("\nНечетные числа:");
        notEvenNumbers();
        number.getNumberList().clear();
    }

    public void  evenNumbers() {
        show(5,number.getNumberList().stream()
                .filter(i -> i.getValue() % 2 == 0)
                .map(i-> i.getValue())
                .collect(Collectors.toList()));

    }

    public void  notEvenNumbers() {
        show(5,number.getNumberList().stream()
                .filter(i -> i.getValue() % 2 != 0)
                .map(i-> i.getValue())
                .collect(Collectors.toList()));
    }

    public void show(int lineLength,List<Number> numberList) {
        int count = 0;
        for (Number number : numberList) {
            System.out.print(number + " ");
            count++;
            if (count == lineLength) {
                System.out.println();
                count = 0;
            }
        }
    }
}