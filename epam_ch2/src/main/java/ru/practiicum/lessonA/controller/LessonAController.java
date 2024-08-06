package ru.practiicum.lessonA.controller;

import ru.practiicum.file.File;
import ru.practiicum.lessonA.model.*;
import ru.practiicum.number.model.Number;
import ru.practiicum.number.model.NumberManage;

import java.util.List;

public class LessonAController {
    private final NumberManage numberManage;
    private File f;
    LessonA lessonA;

    public LessonAController(NumberManage numberManage) {
        this.numberManage = numberManage;
        f = new File();
        lessonA = new LessonA1(this.numberManage);
    }


    public void lesson1() {
        System.out.println("1. Найти самое короткое и самое длинное число. Вывести найденные числа\n" +
                "и их длину.");

        System.out.println("Ввод: id-num");
        lessonA.showNum("0",10, numberManage.getListNumbers());
        lessonA.setNumLength(numberManage.getListNumbers());

        List<Number> num = lessonA.numAscending(numberManage.getListNumbers());
        System.out.println("Число самое короткое: num-length\n" + num.getFirst().getNum() + "-" + num.getFirst().getLength());

        System.out.println("Число самое длинное: num-length\n" + num.getLast().getNum() + "-" + num.getLast().getLength());

        numberManage.getListNumbers().clear();
    }

    public void lesson2() {
        new LessonA2(numberManage).game();
    }

    public void lesson3() {
        new LessonA3(numberManage).game();
    }

    public void lesson4() {
        new LessonA4(numberManage).game();
    }

    public void lesson5() {
        new LessonA5(numberManage).game();
    }

    public void lesson6() {
        new LessonA6(numberManage).game();
    }

    public void lesson7() {
        new LessonA7(numberManage).game();
    }

    public void lesson8() {
        new LessonA8(numberManage).game();
    }

    public void lesson9() {
        new LessonA9(numberManage).game();
    }
}
