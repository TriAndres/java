package ru.practiicum.lessonA.model;

import ru.practiicum.number.ManageNumber;

import static ru.practiicum.console.Console.getInteger;

public class LessonA3 extends LessonA {

    @Override
    public void game() {
        System.out.println("3. Вывести заданное количество случайных чисел с переходом и без перехода\n" +
                "    на новую строку.");
        while (true) {
            menu();
            int name = getInteger();
            if (name < 1) {
                break;
            } else {
                number = new ManageNumber();
                number.setNumRandom(name,1,100);
                System.out.println("С переходом:");
                number.show(1);
                System.out.println("\nБез перехода:");
                number.show(0);
            }
        }
        System.out.println("Вышли из программы");
    }
    @Override
    public void menu() {
        System.out.println("""
                \nВведите:
                - Количество случайных чисел.
                - 0 (выход).
                """);
    }
}