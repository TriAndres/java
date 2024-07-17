package ru.practiicum.lessonA.view;

import ru.practiicum.lessonA.controller.LessonControllerA;

import static ru.practiicum.console.Console.getString;

public class LessonMenuA {
    private final LessonControllerA controller;

    public LessonMenuA() {
        controller = new LessonControllerA();
    }

    public void game() {
        while (true) {
            menu();
            String name = getString();
            if (name.equals("0")) {
                break;
            }
            select(name);
        }
    }

    private void menu() {
        System.out.println("""
                \tВыбирите задачу варианта А:
                \t1
                \t2
                \t3
                \t4
                \t5
                \t6
                \t0 (выход)
                """);
    }

    private void select(String name) {
        switch (name) {
            case "1" -> controller.lesson1();
            case "2" -> controller.lesson2();
            case "3" -> controller.lesson3();
            case "4" -> controller.lesson4();
            case "5" -> controller.lesson5();
            case "6" -> controller.lesson6();
        }
    }
}