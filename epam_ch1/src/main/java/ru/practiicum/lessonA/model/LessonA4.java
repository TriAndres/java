package ru.practiicum.lessonA.model;

import java.util.Scanner;

/*
4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
 */
public class LessonA4 extends LessonA {
    public static void main(String[] args) {
        new LessonA4().game();
    }

    @Override
    public void game() {
        System.out.println("4. Ввести пароль из командной строки и сравнить его со строкой-образцом.");
        while (true) {
            menu();
            int name = input();
            if (name < 1) {
                break;
            } else {
                //
                //
            }
        }
        System.out.println("Вышли из программы");
    }

    private void menu() {
        System.out.println("""
                \nВведите:
                - Введите пароль.
                - 0 (выход).
                """);
    }

    private int input() {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt()) {
                System.out.println("цифра");
                a = sc.nextInt();
                break;
            } else {
                sc.nextLine();
            }
        }
        return a;
    }
}