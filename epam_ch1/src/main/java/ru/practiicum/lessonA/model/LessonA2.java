package ru.practiicum.lessonA.model;

import java.util.Scanner;

/*
2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
public class LessonA2 extends LessonA {
    public static void main(String[] args) {
        new LessonA2().game();
    }

    @Override
    public void game() {
        System.out.println("2. Отобразить в окне консоли аргументы командной строки в обратном порядке.");
        while (true) {
            menu();
            String name = input();
            if (name.equals("0")) {
                break;
            } else {
                StringBuilder line2 = new StringBuilder();
                line2.append(name).reverse();
                System.out.println("В обраном порядке:\n" + line2);
            }
        }
        System.out.println("Вышли из программы");
    }

    private void menu() {
        System.out.println("""
                Введите:
                - Аргумент.
                - 0 (выход).
                """);
    }

    private String input() {
        return new Scanner(System.in).nextLine();
    }
}