package ru.practiicum.view;

import ru.practiicum.lessonA.controller.LessonAController;
import ru.practiicum.lessonA.view.LessonAMenu;
import ru.practiicum.number.controller.NumberController;
import ru.practiicum.number.model.NumberManage;
import ru.practiicum.number.view.NumberMenu;

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
        while (true) {
            menu();
            int select = getIntegerFromTo(1);
            if (select == 6) {
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
                \t6-выход из меню.
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