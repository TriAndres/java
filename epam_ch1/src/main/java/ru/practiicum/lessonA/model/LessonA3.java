package ru.practiicum.lessonA.model;

import ru.practiicum.number.Number;

import java.util.Scanner;

/*
3. Вывести заданное количество случайных чисел с переходом и без перехода
    на новую строку.
 */
public class LessonA3 extends LessonA {

    @Override
    public void game() {
        System.out.println("3. Вывести заданное количество случайных чисел с переходом и без перехода\n" +
                "    на новую строку.");
        while (true) {
            menu();
            int name = input();
            if (name < 1) {
                break;
            } else {
                number = new Number(name);
                number.init();
                number.setNumRandom();
                System.out.println("С переходом:");
                number.show(1);
                System.out.println("\nБез перехода:");
                number.show(0);
            }
        }
        System.out.println("Вышли из программы");
    }

    private void menu() {
        System.out.println("""
                \nВведите:
                - Количество случайных чисел.
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