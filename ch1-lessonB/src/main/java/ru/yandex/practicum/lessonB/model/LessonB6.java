package ru.yandex.practicum.lessonB.model;

import ru.yandex.practicum.number.ManageNumber;
import ru.yandex.practicum.number.Number;

import java.util.ArrayList;
import java.util.List;

public class LessonB6 extends LessonB {
    public LessonB6(ManageNumber manageNumber) {
        super(manageNumber);
    }

    @Override
    public void game() {
        System.out.println("6. Простые числа.");
        numAllShow(20, 1, 50, 5);
        System.out.println("Простые числа: ");
        manageNumber.show(10, getNumberList());
        manageNumber.getNumberList().clear();
    }

    public List<Number> getNumberList() {
        List<Number> numberList = new ArrayList<>();
        for (Number number : manageNumber.getNumberList()) {
            if (isPrime(number.getValue())) {
                numberList.add(number);
            }
        }
        return numberList;
    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0 || number == 1) {
                return false;
            }
        }
        return true;
    }

}