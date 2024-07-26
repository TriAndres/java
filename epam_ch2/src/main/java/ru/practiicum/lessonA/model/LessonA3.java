package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.NumberManage;

public class LessonA3 extends LessonA{
    public LessonA3(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("3. Вывести на консоль те числа, длина которых меньше (больше) средней,\n" +
                "а также длину.");
        System.out.println("Ввод:");
        showNum("1",10, numberManage.getListNumbers());
    }
}
