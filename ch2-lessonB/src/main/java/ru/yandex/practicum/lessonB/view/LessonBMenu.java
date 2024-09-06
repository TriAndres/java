package ru.yandex.practicum.lessonB.view;

import ru.yandex.practicum.lessonB.controllerB.LessonBController;

import static ru.yandex.practicum.console.Console.getInteger;

public class LessonBMenu {
    private final LessonBController lc;

    public LessonBMenu() {
        lc = new LessonBController();
    }

    public void game() {
        while (true) {
            int num = menu();
            if (num == 0) break;
            select(num);
        }
        System.out.println("Вышли из меню задач.");
    }

    private int menu() {
        System.out.println("\n\tВыбирите действие:" +
                "\n\t1 - Задача N1" +
                "\n\t2 - Задача N2" +
                "\n\t3 - Задача N3" +
                "\n\t4 - Задача N4" +
                "\n\t5 - Задача N5" +
                "\n\t6 - Задача N6" +
                "\n\t7 - Задача N7" +
                "\n\t8 - Задача N8" +
                "\n\t9 - Задача N9" +
                "\n\t0 - Выход из меню");
        return getInteger(-1);
    }

    private void select(int num) {
        switch (num) {
            case 1:
                lc.lesson1();
                break;
            case 2:
                lc.lesson2();
                break;
            case 3:
                lc.lesson3();
                break;
            case 4:
                lc.lesson4();
                break;
            case 5:
                lc.lesson5();
                break;
            case 6:
                lc.lesson6();
                break;
            case 7:
                lc.lesson7();
                break;
            case 8:
                lc.lesson8();
                break;
            case 9:
                lc.lesson9();
                break;
            default:
                System.out.println("Выбирите номер из списка задач.");
                break;
        }
    }
}