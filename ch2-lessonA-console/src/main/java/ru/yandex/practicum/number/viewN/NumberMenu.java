package ru.yandex.practicum.number.viewN;

import ru.yandex.practicum.number.controller.NumberController;

import static ru.yandex.practicum.console.Console.getIntegerFromTo;


public class NumberMenu implements MenuN {
    private final NumberController controller;

    public NumberMenu(NumberController controller) {
        this.controller = controller;
    }

    @Override
    public void game() {
        while (true) {
            menu();
            int select = getIntegerFromTo(0);
            if (select == 0) {
                System.out.println("Выход из меню цифр.");
                break;
            }
            select(select);
        }
    }

    @Override
    public void menu() {
        System.out.println("""
                \tВведите действие:
                \t1-добавить цифру.
                \t2-обновить цифру.
                \t3-вернуть цифру по id.
                \t4-удалить цифру по id.
                \t5-удалить весь список.
                \t6-вывести весь список цифр.
                \t7-записать рандом список цифр.
                \t0-выход из меню.
                """);
    }

    @Override
    public void select(int select) {
        switch (select) {
            case 1 -> controller.save();
            case 2 -> controller.update();
            case 3 -> controller.getById();
            case 4 -> controller.deleteById();
            case 5 -> controller.clear();
            case 6 -> controller.getListNumbers();
            case 7 -> controller.setListNumRandom();
        }
    }
}
