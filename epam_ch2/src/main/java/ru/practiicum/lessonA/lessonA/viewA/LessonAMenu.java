package ru.practiicum.lessonA.lessonA.viewA;


import ru.practiicum.lessonA.lessonA.controllerA.LessonAController;
import ru.practiicum.lessonA.number.view.MenuA;

import static ru.practiicum.console.Console.getIntegerFromTo;

public class LessonAMenu implements MenuA {

    private final LessonAController controller;

    public LessonAMenu(LessonAController controller) {
        this.controller = controller;
    }

    @Override
    public void game() {
        while (true) {
            menu();
            int select = getIntegerFromTo(0);
            if (select == 0) {
                System.out.println("Выход из меню задач А.");
                break;
            }
            select(select);
        }
    }

    @Override
    public void menu() {
        System.out.println("""
                \tВведите номер задачи:
                \tN1
                \tN2
                \tN3
                \tN4
                \tN5
                \tN6
                \tN7
                \tN8
                \tN9
                \t0 - выход.
                """);
    }

    @Override
    public void select(int select) {
        switch (select) {
            case 1 -> controller.lesson1();
            case 2 -> controller.lesson2();
            case 3 -> controller.lesson3();
            case 4 -> controller.lesson4();
            case 5 -> controller.lesson5();
            case 6 -> controller.lesson6();
            case 7 -> controller.lesson7();
            case 8 -> controller.lesson8();
            case 9 -> controller.lesson9();
        }
    }
}
