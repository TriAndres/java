package ru.yandex.practicum.lessonB.model;

import ru.yandex.practicum.number.ManageNumber;
import ru.yandex.practicum.number.Number;

import java.util.List;

public class LessonB3 extends LessonB {
    public LessonB3(ManageNumber manageNumber) {
        super(manageNumber);
    }

    @Override
    public void game() {
        System.out.println("3. Числа, которые делятся на 3 или на 9.");
        numAllShow(20, 1, 100, 5);
        System.out.println("Числа, делятся на 3 или на 9: ");
        manageNumber.show(10, getNumberList());
        manageNumber.getNumberList().clear();
    }

    public List<Number> getNumberList() {
        return manageNumber
                .getNumberList()
                .stream()
                .filter(i -> i.getValue() % 3 == 0)
                .toList();
    }
}