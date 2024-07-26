package ru.practiicum.lessonA.controller;

import ru.practiicum.lessonA.model.*;
import ru.practiicum.number.model.NumberManage;

public class LessonAController {
    private final NumberManage numberManage;

    public LessonAController(NumberManage numberManage) {
        this.numberManage = numberManage;
    }

    public void lesson1() {
        new LessonA1(numberManage).game();
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
