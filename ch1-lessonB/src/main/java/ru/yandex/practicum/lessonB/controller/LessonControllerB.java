package ru.yandex.practicum.lessonB.controller;

import ru.yandex.practicum.lessonB.model.*;
import ru.yandex.practicum.number.ManageNumber;

public class LessonControllerB {
    private ManageNumber manageNumber;

    public LessonControllerB() {
        manageNumber = new ManageNumber();
    }

    public void lesson1() {
        new LessonB1(manageNumber).game();
    }

    public void lesson2() {
        new LessonB2(manageNumber).game();
    }
    public void lesson3() {
        new LessonB3(manageNumber).game();
    }
    public void lesson4() {
        new LessonB4(manageNumber).game();
    }

    public void lesson5() {
        new LessonB5(manageNumber).game();
    }

    public void lesson6() {
        new LessonB6(manageNumber).game();
    }

    public void lesson7() {
        new LessonB7(manageNumber).game();
    }

    public void lesson8() {
        new LessonB8(manageNumber).game();
    }
    public void lesson9() {
        new LessonB9(manageNumber).game();
    }
    public void lesson10() {
        new LessonB10(manageNumber).game();
    }

    public void lesson11() {
        new LessonB11(manageNumber).game();
    }
}