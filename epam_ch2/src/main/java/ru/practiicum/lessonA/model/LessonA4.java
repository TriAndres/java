package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.NumberManage;

public class LessonA4 extends LessonA{
    public LessonA4(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("4. Найти число, в котором число различных цифр минимально. Если таких\n" +
                "чисел несколько, найти первое из них.");
        System.out.println("Ввод:");
        showNum("1",10, numberManage.getListNumbers());
    }
}
