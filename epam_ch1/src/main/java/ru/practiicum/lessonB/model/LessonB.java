package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;

public abstract class LessonB {
    protected ManageNumber number;

    public LessonB(ManageNumber number) {
        this.number = number;
    }

    public abstract void game();

    public void numAllShow(int size, int from, int to, int lineLength) {
        System.out.println("Весь список цифр:");
        number.setNumRandom(size, from, to);
        number.show(lineLength);
    }
}
