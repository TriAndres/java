package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;

public class LessonB2 extends LessonB {
    public LessonB2(ManageNumber number) {
        super(number);
    }

    @Override
    public void game() {
        System.out.println("2. Наибольшее и наименьшее число.");
    }
}