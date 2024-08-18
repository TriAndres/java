package ru.practiicum.lessonB.controller;

import ru.practiicum.lessonB.model.*;
import ru.practiicum.number.ManageNumber;

public class LessonControllerB {
    private ManageNumber number;

    public LessonControllerB() {
        number = new ManageNumber();
    }

    public void lesson1() {
        new LessonB1(number).game();
    }

    public void lesson2() {
        new LessonB2(number).game();
    }
    public void lesson3() {
        new LessonB3(number).game();
    }
    public void lesson4() {
        new LessonB4(number).game();
    }

    public void lesson5() {
        new LessonB5(number).game();
    }

    public void lesson6() {
        new LessonB6(number).game();
    }

    public void lesson7() {
        new LessonB7(number).game();
    }

    public void lesson8() {
        new LessonB8(number).game();
    }
    public void lesson9() {
        new LessonB9(number).game();
    }
    public void lesson10() {
        new LessonB10(number).game();
    }

    public void lesson11() {
        new LessonB11(number).game();
    }
}