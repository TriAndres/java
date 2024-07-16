package ru.practiicum.lessonB.view;

import ru.practiicum.lessonB.controller.LessonControllerB;

import java.util.Scanner;

public class LessonMenuB {
    public static void main(String[] args) {
        new LessonMenuB().game();
    }

    private final LessonControllerB controller;

    public LessonMenuB() {
        controller = new LessonControllerB();
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
                5
                6
                7
                8
                9
                10
                11
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
            case "5" -> controller.lesson5();
            case "6" -> controller.lesson6();
            case "7" -> controller.lesson7();
            case "8" -> controller.lesson8();
            case "9" -> controller.lesson9();
            case "10" -> controller.lesson10();
            case "11" -> controller.lesson11();
        }
    }
}
