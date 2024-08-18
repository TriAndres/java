package ru.practiicum.lessonA.model;

import ru.practiicum.number.ManageNumber;
import ru.practiicum.user.User;

public abstract class LessonA {
    protected User user;
    protected ManageNumber number;

    public abstract void game();
    public abstract void menu();
}