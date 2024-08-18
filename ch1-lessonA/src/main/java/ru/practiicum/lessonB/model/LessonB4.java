package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;
import ru.practiicum.number.Number;

import java.util.List;

public class LessonB4 extends LessonB {
    public LessonB4(ManageNumber number) {
        super(number);
    }

    @Override
    public void game() {
        System.out.println("4. Числа, которые делятся на 5 и на 7.");
        numAllShow(20, 1, 100, 5);
        System.out.println("Числа, делятся на 5 и на 7: ");
        number.show(10, getNumberList());
        number.getNumberList().clear();
    }

    public List<Number> getNumberList() {
        return number
                .getNumberList()
                .stream()
                .filter(i -> i.getValue() % 5 == 0 && i.getValue() % 7 == 0)
                .toList();
    }
}