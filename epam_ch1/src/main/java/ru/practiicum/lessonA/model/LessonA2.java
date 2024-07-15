package ru.practiicum.lessonA.model;

import ru.practiicum.user.User;

import static ru.practiicum.console.Console.getString;

public class LessonA2 extends LessonA {

    @Override
    public void game() {
        System.out.println("2. Отобразить в окне консоли аргументы командной строки в обратном порядке.");
        while (true) {
            menu();
            user = new User();
            user.setArgument(getString());
            if (user.getArgument().equals("0")) {
                break;
            } else {
                StringBuilder line2 = new StringBuilder();
                line2.append(user.getArgument()).reverse();
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
}