package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;

public class LessonB3 extends LessonB {
    public LessonB3(ManageNumber number) {
        super(number);
    }

    @Override
    public void game() {
        System.out.println("3. Числа, которые делятся на 3 или на 9.");
    }
}