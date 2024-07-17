package ru.practiicum.lessonA.model;

import ru.practiicum.user.User;

import static ru.practiicum.console.Console.getString;

public class LessonA1 extends LessonA {

    @Override
    public void game() {
        System.out.println("1 Приветствовать любого пользователя при вводе его имени через командную строку");
        while (true) {
            menu();
            user = new User(getString());
            if (user.getName().equals("0")) {
                break;
            } else {
                System.out.println(user.getName() + ", вас приветствую!");
            }
        }
        System.out.println("Вышли из программы");
    }
    @Override
    public void menu() {
        System.out.println("""
                Введите:
                - Ваше Имя.
                - 0 (выход).
                """);
    }
}