package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.NumberManage;

public class LessonA1 extends LessonA{
    public LessonA1(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("1. Найти самое короткое и самое длинное число. Вывести найденные числа\n" +
                "и их длину.");
        System.out.println("Ввод:");
        showNum("1",10, numberManage.getListNumbers());
    }
}
