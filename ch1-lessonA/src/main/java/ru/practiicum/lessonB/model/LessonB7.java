package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;
import ru.practiicum.number.Number;

import java.util.List;

public class LessonB7 extends LessonB {
    public LessonB7(ManageNumber number) {
        super(number);
    }

    @Override
    public void game() {
        System.out.println("7. Отсортированные числа в порядке возрастания и убывания.");
        numAllShow(20, 1, 50, 5);
        System.out.println("Числа в порядке возрастания:");
        number.show(5, numAscending());
        System.out.println("Числа в порядке убывания:");
        number.show(5, numDecreasing());
        number.getNumberList().clear();

    }

    public List<Number> numAscending() {
        return number
                .getNumberList()
                .stream()
                .sorted((a, b) -> a.getValue() - b.getValue())
                .toList();
    }

    public List<Number> numDecreasing() {
        return number
                .getNumberList()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .toList();
    }
}