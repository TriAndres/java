package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.NumberManage;

public class LessonA9 extends LessonA{
    public LessonA9(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("9. Найти корни квадратного уравнения. Параметры уравнения передавать\n" +
                "с командной строкой.");
        System.out.println("Ввод:");
        showNum("1",10, numberManage.getListNumbers());
    }
}
