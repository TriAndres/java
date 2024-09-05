package ru.yandex.practicum.model;

import ru.yandex.practicum.number.ManageNumber;
import ru.yandex.practicum.number.Number;

import java.util.List;

public class LessonB7 extends LessonB {
    public LessonB7(ManageNumber manageNumber) {
        super(manageNumber);
    }

    @Override
    public void game() {
        System.out.println("7. Отсортированные числа в порядке возрастания и убывания.");
        numAllShow(20, 1, 50, 5);
        System.out.println("Числа в порядке возрастания:");
        manageNumber.show(5, numAscending());
        System.out.println("Числа в порядке убывания:");
        manageNumber.show(5, numDecreasing());
        manageNumber.getNumberList().clear();

    }

    public List<Number> numAscending() {
        return manageNumber
                .getNumberList()
                .stream()
                .sorted((a, b) -> a.getValue() - b.getValue())
                .toList();
    }

    public List<Number> numDecreasing() {
        return manageNumber
                .getNumberList()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .toList();
    }
}