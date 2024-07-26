package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.NumberManage;

public class LessonA7 extends LessonA{
    public LessonA7(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("7. Найти число, состоящее только из различных цифр. Если таких чисел не\n" +
                "сколько, найти первое из них.");
        System.out.println("Ввод:");
        showNum("1",10, numberManage.getListNumbers());
    }
}
