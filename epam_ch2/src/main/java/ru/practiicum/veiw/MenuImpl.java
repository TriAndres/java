package ru.practiicum.veiw;

import ru.practiicum.number.controller.NumberController;
import ru.practiicum.number.model.NumberManage;
import ru.practiicum.number.view.Menu;
import ru.practiicum.number.view.NumberMenu;

import static ru.practiicum.console.Console.getIntegerFromTo;

public class MenuImpl implements Menu {
    private NumberManage numberManage;
    private NumberController numberController;
    private NumberMenu numberMenu;

    public MenuImpl() {
        numberManage = new NumberManage();
        numberController = new NumberController(numberManage);
        numberMenu = new NumberMenu(numberController);
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
                \t6-выход из меню.
                """);
    }

    @Override
    public void select(int select) {
        switch (select) {
            case 1 -> numberMenu.game();
        }
    }
}