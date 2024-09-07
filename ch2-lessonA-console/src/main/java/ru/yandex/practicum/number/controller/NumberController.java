package ru.yandex.practicum.number.controller;

import ru.yandex.practicum.file.File;
import ru.yandex.practicum.lessonA.modelA.MethodA;
import ru.yandex.practicum.number.model.Number;
import ru.yandex.practicum.number.model.NumberManage;

import java.util.ArrayList;

import static ru.yandex.practicum.console.Console.getInteger;
import static ru.yandex.practicum.console.Console.getIntegerFromTo;

public class NumberController implements Controller {
    private final NumberManage manageNumber;
    private final File f;
    private final String nameFile = "ch2-lessonA-console\\src\\main\\java\\ru\\yandex\\practicum\\file\\NumberFile.txt";
    private final MethodA lessonA;

    public NumberController(NumberManage manageNumber) {
        this.manageNumber = manageNumber;
        f = new File();
        lessonA = new MethodA();
    }
    @Override
    public void getInitNum() {
        if (!f.getFile(nameFile).isEmpty()) {
            for (Number number : f.getFile(nameFile)) {
                manageNumber.save(number);
            }
            lessonA.setNumLength(manageNumber.getListNumbers());
            lessonA.differentNum(manageNumber.getListNumbers());
        } else {
            new ArrayList<>();
        }
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
        f.setFile(nameFile,manageNumber.getListNumbers());
        lessonA.setNumLength(manageNumber.getListNumbers());
        lessonA.differentNum(manageNumber.getListNumbers());
    }

    @Override
    public void update() {
        System.out.println("Введите id:");
        int id = getInteger();
        System.out.println("Введите цифру:");
        int num = getInteger();
        manageNumber.update(new Number(id, num));
        System.out.println("Обновлена цифра в списке");
        f.setFile(nameFile,manageNumber.getListNumbers());
        lessonA.setNumLength(manageNumber.getListNumbers());
        lessonA.differentNum(manageNumber.getListNumbers());
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
        f.setFile(nameFile,manageNumber.getListNumbers());
        lessonA.setNumLength(manageNumber.getListNumbers());
        lessonA.differentNum(manageNumber.getListNumbers());
    }
}
