package ru.practiicum.number.controller;

import ru.practiicum.number.model.Number;
import ru.practiicum.number.model.NumberManage;

import static ru.practiicum.console.Console.getInteger;
import static ru.practiicum.console.Console.getIntegerFromTo;

public class NumberController implements Controller {
    private final NumberManage manageNumber;

    public NumberController(NumberManage manageNumber) {
        this.manageNumber = manageNumber;
    }

    @Override
    public void getListNumbers() {
        if (!manageNumber.getListNumbers().isEmpty()) {
            for (Number n : manageNumber.getListNumbers()) {
                System.out.println("id-" + n.getId() + ":num-" + n.getNum());
            }
        } else {
            System.out.println("Список пуст");
        }



    }

    @Override
    public void save() {
        System.out.println("Введите цифру:");
        manageNumber.save(new Number(getInteger()));
        System.out.println("Записана цифра в список.");
    }

    @Override
    public void update() {
        System.out.println("Введите id:");
        int id = getInteger();
        System.out.println("Введите цифру:");
        int num = getInteger();
        manageNumber.update(new Number(id, num));
        System.out.println("Обновлена цифра в списке");
    }

    @Override
    public void getById() {
        System.out.println("Введите id цифры:");
        Number n = manageNumber.getById(getIntegerFromTo(1));
        System.out.println("id-" + n.getId() + ":num-" + n.getNum());
    }

    @Override
    public void deleteById() {
        System.out.println("Введите id цифры:");
        manageNumber.deleteById(getIntegerFromTo(1));
        System.out.println("Удалена цифра по id");
    }

    @Override
    public void clear() {
        manageNumber.clear();
        System.out.println("Удалён весь список цифр.");
    }

    @Override
    public void setListNumRandom() {
        System.out.println("ведите размер массива:");
        int size = getIntegerFromTo(1);
        System.out.println("Введите from:");
        int from = getIntegerFromTo(1);
        System.out.println("Введите to:");
        int to = getIntegerFromTo(from);
        manageNumber.setListNumRandom(size, from, to);
        System.out.println("Записан массив цифр");
    }
}
