package ru.yandex.practicum.model;

import ru.yandex.practicum.number.ManageNumber;
import ru.yandex.practicum.number.Number;

import java.util.ArrayList;
import java.util.List;

public class LessonB10 extends LessonB {
    public LessonB10(ManageNumber manageNumber) {
        super(manageNumber);
    }

    @Override
    public void game() {
        System.out.println("10. Числа-палиндромы,значения которых в прямом и обратном порядке совпадают.");
        numAllShow(20, 100, 999, 5);
        System.out.println("Числа-палиндромы:");
        manageNumber.show(5,numPalindrome(manageNumber.getNumberList()));
        manageNumber.getNumberList().clear();
    }

    private List<Number> numPalindrome(List<Number> line) {
        List<Number> list = new ArrayList<>();
        for (Number number1 : manageNumber.getNumberList()) {
            String line1 = String.valueOf(number1.getValue());
            String line2 = new StringBuilder().append(line1).reverse().toString();
            if (line1.equals(line2)) {
                list.add(new Number(number1.getValue()));
            }
        }
        return list;
    }

}