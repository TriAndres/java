package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;
import ru.practiicum.number.Number;

import java.util.List;

public class LessonB3 extends LessonB {
    public LessonB3(ManageNumber number) {
        super(number);
    }

    @Override
    public void game() {
        System.out.println("3. Числа, которые делятся на 3 или на 9.");
        numAllShow(20, 1, 100, 5);
        System.out.println("Числа, делятся на 3 или на 9: ");
        number.show(10, getNumberList());
    }

    public List<Number> getNumberList() {
        return number
                .getNumberList()
                .stream()
                .filter(i -> i.getValue() % 3 == 0)
                .toList();
    }
}