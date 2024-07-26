package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.NumberManage;

public class LessonA8 extends LessonA{
    public LessonA8(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("8. Среди чисел найти число-палиндром. Если таких чисел больше одного,\n" +
                "найти второе.");
        System.out.println("Ввод:");
        showNum("1",10, numberManage.getListNumbers());
    }
}
