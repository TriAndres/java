package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;

public class LessonB4 extends LessonB {
    public LessonB4(ManageNumber number) {
        super(number);
    }

    @Override
    public void game() {
        System.out.println("4. Числа, которые делятся на 5 и на 7.");
    }
}