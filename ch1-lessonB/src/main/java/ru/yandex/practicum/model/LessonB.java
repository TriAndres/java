package ru.yandex.practicum.lessonB.model;

import ru.yandex.practicum.number.ManageNumber;

public abstract class LessonB {
    protected ManageNumber manageNumber;

    public LessonB(ManageNumber manageNumber) {
        this.manageNumber = manageNumber;
    }

    public abstract void game();

    public void numAllShow(int size, int from, int to, int lineLength) {
        System.out.println("Весь список цифр:");
        manageNumber.setNumRandom(size, from, to);
        manageNumber.show(lineLength);
    }
}
