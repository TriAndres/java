package ru.yandex.practicum.model;

import ru.yandex.practicum.number.ManageNumber;
import ru.yandex.practicum.number.Number;

import java.util.List;

public class LessonB4 extends LessonB {
    public LessonB4(ManageNumber manageNumber) {
        super(manageNumber);
    }

    @Override
    public void game() {
        System.out.println("4. Числа, которые делятся на 5 и на 7.");
        numAllShow(20, 1, 100, 5);
        System.out.println("Числа, делятся на 5 и на 7:");
        manageNumber.show(10, getNumberList());
        manageNumber.getNumberList().clear();
    }

    public List<Number> getNumberList() {
        return manageNumber
                .getNumberList()
                .stream()
                .filter(i -> i.getValue() % 5 == 0 && i.getValue() % 7 == 0)
                .toList();
    }
}