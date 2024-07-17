package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;

public class LessonB8 extends LessonB {
    public LessonB8(ManageNumber number) {
        super(number);
    }

    @Override
    public void game() {
        System.out.println("8. Числа в порядке убывания частоты встречаемости чисел.");
    }
}