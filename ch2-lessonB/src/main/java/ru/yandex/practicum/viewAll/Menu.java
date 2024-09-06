package ru.yandex.practicum.viewAll;

import ru.yandex.practicum.lessonB.view.LessonBMenu;

import static ru.yandex.practicum.console.Console.getInteger;

public class Menu {
    private LessonBMenu lm;

    public Menu() {
        lm = new LessonBMenu();
    }

    public void game() {
        while (true) {
            int num = menu();
            if (num == 0) break;
            select(num);
        }
        System.out.println("Вышли из главногог меню.");
    }

    private int menu() {
        System.out.println("\n\tВыбирите действие:" +
                "\n\t1 - Задачи" +
                "\n\t0 - Выход из меню");
        return getInteger(-1);
    }

    private void select(int num) {
        switch (num) {
            case 1:
                lm.game();
                break;
            default:
                System.out.println("Выбирите номер из списка задач.");
                break;
        }
    }
}