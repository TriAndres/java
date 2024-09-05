package ru.yandex.practicum.model;

import ru.yandex.practicum.number.ManageNumber;
import ru.yandex.practicum.number.Number;

import java.util.ArrayList;
import java.util.List;

/*
Счастливым будет считаться такое число из шести цифр,
в котором сумма левых трех цифр равна сумме правых трех,
например: 457961:4+5+5=9+6+1=16. найдите все счастливые
числа в интервале от 100000 до 999999
 */
public class LessonB9 extends LessonB {
    public LessonB9(ManageNumber manageNumber) {
        super(manageNumber);
    }

    @Override
    public void game() {
        System.out.println("9. Счастливые» числа.");
        numAllShow(20, 100000, 999999, 5);
        System.out.println("Счастливые» числа :");
        manageNumber.show(5, numLucky(manageNumber.getNumberList()));
        manageNumber.getNumberList().clear();
    }

    public List<Number> numLucky(List<Number> numberList) {
        List<Number> list = new ArrayList<>();
        for (Number number1 : numberList) {
            String[] a = String.valueOf(number1.getValue()).split("");
            int num1 = Integer.parseInt(a[0]) + Integer.parseInt(a[1]) + Integer.parseInt(a[2]);
            int num2 = Integer.parseInt(a[3]) + Integer.parseInt(a[4]) + Integer.parseInt(a[5]);
            if (num1 == num2) {
                list.add(new Number(number1.getValue()));
            }
        }
        return list;
    }
}