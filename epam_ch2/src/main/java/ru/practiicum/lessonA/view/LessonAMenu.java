package ru.practiicum.lessonA.view;


import ru.practiicum.lessonA.controller.LessonAController;
import ru.practiicum.number.view.MenuA;

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
            int select = getIntegerFromTo(1);
            if (select == 10) {
                break;
            }
            select(select);
        }
    }

    @Override
    public void menu() {
        System.out.println("""
                \tВведите номер задачи:
                \t1
                \t2
                \t3
                \t4
                \t5
                \t6
                \t7
                \t8
                \t9
                \t10 - выход.
                """);
    }

    @Override
    public void select(int select) {
        switch (select) {
            case 1 -> controller.lesson1();
            case 2 -> controller.lesson1();
            case 3 -> controller.lesson1();
            case 4 -> controller.lesson1();
            case 5 -> controller.lesson1();
            case 6 -> controller.lesson6();
            case 7 -> controller.lesson7();
            case 8 -> controller.lesson8();
            case 9 -> controller.lesson9();
        }
    }
}
