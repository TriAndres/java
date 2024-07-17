package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;

public class LessonB5 extends LessonB {
    public LessonB5(ManageNumber number) {
        super(number);
    }

    @Override
    public void game() {
        System.out.println("5. Все трехзначные числа, в десятичной записи которых нет одинаковых\n" +
                "цифр.");
    }
}