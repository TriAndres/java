package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;

public class LessonB2 extends LessonB {
    public LessonB2(ManageNumber number) {
        super(number);
    }

    @Override
    public void game() {
        System.out.println("2. Наибольшее и наименьшее число.");
        numAllShow(20, 1, 100, 5);
        System.out.println("Наибольшее число: " + max());
        System.out.println("Наименьшее число: " + min());
        number.getNumberList().clear();
    }

    public Integer max() {
        return number
                .getNumberList()
                .stream().map(i-> i.getValue())
                .max(Integer::compare)
                .get();
    }

    public Integer min() {
        return number
                .getNumberList()
                .stream().map(i-> i.getValue())
                .min(Integer::compare)
                .get();
    }
}