package ru.practiicum.view;

import ru.practiicum.lessonA.lessonA.controllerA.LessonAController;
import ru.practiicum.lessonA.lessonA.viewA.LessonAMenu;
import ru.practiicum.lessonA.number.controller.NumberController;
import ru.practiicum.lessonA.number.model.NumberManage;
import ru.practiicum.lessonA.number.view.NumberMenu;

import static ru.practiicum.console.Console.getIntegerFromTo;

public class MenuImpl implements MenuM {
    private NumberManage numberManage;
    private NumberController numberController;
    private NumberMenu numberMenu;
    private LessonAController lessonAController;
    private LessonAMenu lessonAMenu;

    public MenuImpl() {
        numberManage = new NumberManage();
        numberController = new NumberController(numberManage);
        numberMenu = new NumberMenu(numberController);
        lessonAController = new LessonAController(numberManage);
        lessonAMenu = new LessonAMenu(lessonAController);

    }

    @Override
    public void game() {
        numberController.getInitNum();
        while (true) {
            menu();
            int select = getIntegerFromTo(0);
            if (select == 0) {
                System.out.println("Выход из программы.");
                break;
            }
            select(select);
        }
    }

    @Override
    public void menu() {
        System.out.println("""
                \tВведите действие:
                \t1-меню цифр.
                \t2-меню задач А
                \t0-выход из меню.
                """);
    }

    @Override
    public void select(int select) {
        switch (select) {
            case 1 -> numberMenu.game();
            case 2 -> lessonAMenu.game();
        }
    }
}