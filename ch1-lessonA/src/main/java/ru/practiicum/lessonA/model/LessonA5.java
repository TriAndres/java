package ru.practiicum.lessonA.model;

import static ru.practiicum.console.Console.getInteger;

public class LessonA5 extends LessonA {
    public static void main(String[] args) {
        new LessonA5().game();
    }

    @Override
    public void game() {
        System.out.println("5. Ввести целые числа как аргументы командной строки, подсчитать их сум\n" +
                "мы и произведения. Вывести результат на консоль.");
        int sum = 0;
        int mul = 1;
        int predel = 100_000;
        while (true) {
            menu();
            int num = getInteger();
            if (num == 0) {
                break;
            } else if (num > predel) {
                System.out.println("Вышли за предел " + predel);
                break;
            }else {
                System.out.println("сумма: " + (sum += num));
                System.out.println("произведение: " + (mul *= num));
            }
        }
        System.out.println("Вышли из программы");
    }
    @Override
    public void menu() {
        System.out.println("""
                Введите:
                - Число.
                - 0 (выход).
                """);
    }
}