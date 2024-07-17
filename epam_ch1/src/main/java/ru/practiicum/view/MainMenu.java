package ru.practiicum.view;

import ru.practiicum.lessonA.view.LessonMenuA;
import ru.practiicum.lessonB.view.LessonMenuB;

import static ru.practiicum.console.Console.getInteger;

public class MainMenu {
    private final LessonMenuA menuA;
    private final LessonMenuB menuB;

    public MainMenu() {
        menuA = new LessonMenuA();
        menuB = new LessonMenuB();
    }

    public void run() {
        while (true) {
            menu();
            int select = getInteger();
            if (select == 0) {
                break;
            }
            select(select);
        }
        System.out.println("Вышли из программы");
    }

    public void menu() {
        System.out.println("""
                \t1 - меню задач А
                \t2 - меню задач В
                \t0 - выход
                """);
    }

    private void select(int select) {
        switch (select) {
            case 1 -> menuA.game();
            case 2 -> menuB.game();
        }
    }
}
