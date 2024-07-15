package ru.practiicum.lessonA.view;

import ru.practiicum.lessonA.controller.LessonControllerA;

import java.util.Scanner;

public class LessonMenuA {
    private final LessonControllerA controller;

    public LessonMenuA() {
        controller = new LessonControllerA();
    }

    public void game() {
        while (true) {
            menu();
            String name = input();
            if (name.equals("0")) {
                break;
            }
            select(name);
        }
    }

    private void menu() {
        System.out.println("""
                Выбирите задачу варианта А:
                1
                2
                3
                4
                0 (выход)
                """);
    }

    private String input() {
        return new Scanner(System.in).nextLine();
    }

    private void select(String name) {
        switch (name) {
            case "1" -> controller.lesson1();
            case "2" -> controller.lesson2();
            case "3" -> controller.lesson3();
            case "4" -> controller.lesson4();
        }
    }

}
