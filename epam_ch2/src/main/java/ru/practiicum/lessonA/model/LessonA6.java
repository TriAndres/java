package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.NumberManage;

public class LessonA6 extends LessonA{
    public LessonA6(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("6. Найти число, цифры в котором идут в строгом порядке возрастания. Если\n" +
                "таких чисел несколько, найти первое из них.");
        System.out.println("Ввод:");
        showNum("1",10, numberManage.getListNumbers());
    }
}
