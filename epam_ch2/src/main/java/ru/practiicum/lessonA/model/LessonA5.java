package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.Number;
import ru.practiicum.number.model.NumberManage;

public class LessonA5 extends LessonA{
    public LessonA5(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("5. Найти количество чисел, содержащих только четные цифры, а среди них —\n" +
                "количество чисел с равным числом четных и нечетных цифр.");
        numberManage.setListNumRandom(20, 1000, 9999);
        System.out.println("Ввод: id-num");
        showNum("0", 10, numberManage.getListNumbers());

        for (Number n : numberManage.getListNumbers()) {

        }
    }
}
