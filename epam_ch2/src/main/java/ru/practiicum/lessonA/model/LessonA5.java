package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.NumberManage;

public class LessonA5 extends LessonA{
    public LessonA5(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("5. Найти количество чисел, содержащих только четные цифры, а среди них —\n" +
                "количество чисел с равным числом четных и нечетных цифр.");
        System.out.println("Ввод:");
        showNum("1",10, numberManage.getListNumbers());
    }
}
