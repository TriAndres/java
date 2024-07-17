package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;

public class LessonB10 extends LessonB {
    public LessonB10(ManageNumber number) {
        super(number);
    }

    @Override
    public void game() {
        System.out.println("10. Числа-палиндромы,значения которых в прямом и обратном порядке совпадают.");
    }
}