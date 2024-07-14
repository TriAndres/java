package ru.practiicum.option.model.lessonA;

import ru.practiicum.option.model.user.User;

import java.util.Scanner;

/*
1 Приветствовать любого пользователя при вводе его имени через командную строку
 */
public class LessonA1 extends LessonA {

    @Override
    public void game() {
        System.out.println("1 Приветствовать любого пользователя при вводе его имени через командную строку");
        while (true) {
            menu();
            user = new User(input());
            if (user.getName().equals("0")) {
                break;
            } else {
                System.out.println(user.getName() + ", вас приветствую!");
            }

        }
        System.out.println("Вышли из программы");
    }

    private void menu() {
        System.out.println("""
                Введите:
                - Ваше Имя.
                - 0 (выход).
                """);
    }

    private String input() {
        return new Scanner(System.in).nextLine();
    }
}