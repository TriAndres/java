package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;

public class LessonB11 extends LessonB {
    public LessonB11(ManageNumber number) {
        super(number);
    }

    @Override
    public void game() {
        System.out.println("11. Элементы, которые равны полусумме соседних элементов.");
    }
}