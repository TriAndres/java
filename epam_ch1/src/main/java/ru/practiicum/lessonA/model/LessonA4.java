package ru.practiicum.lessonA.model;

import ru.practiicum.user.User;

import static ru.practiicum.console.Console.getString;

public class LessonA4 extends LessonA {

    @Override
    public void game() {
        System.out.println("4. Ввести пароль из командной строки и сравнить его со строкой-образцом.");
        while (true) {
            user = new User();
            user.setPassword("password");
            menu();
            String password = getString();
            if (password.equals("0")) {
                break;
            } else {
                if (password.equals(user.getPassword())) {
                    System.out.println("Ввели верно");
                    break;
                } else {
                    System.out.println("Введите верный пароль");
                }
            }
        }
        System.out.println("Вышли из программы");
    }

    private void menu() {
        System.out.println("""
                \nВведите:
                - Пароль.
                - 0 (выход).
                """);
    }
}