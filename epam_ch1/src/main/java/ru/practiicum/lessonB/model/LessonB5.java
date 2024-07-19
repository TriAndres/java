package ru.practiicum.lessonB.model;

import ru.practiicum.number.ManageNumber;
import ru.practiicum.number.Number;

import java.util.ArrayList;
import java.util.List;

public class LessonB5 extends LessonB {
    public LessonB5(ManageNumber number) {
        super(number);
    }

    @Override
    public void game() {
        System.out.println("5. Все трехзначные числа, в десятичной записи которых нет одинаковых\n" +
                "цифр.");
        numAllShow(20, 100, 999, 5);
        System.out.println("Нет одинаковых трехзначных чисел: ");
        number.show(10,numberList((a,b,c) -> a != b && b != c && c != a));
        number.getNumberList().clear();
    }

    public List<Number> numberList(Predicates predicates) {
        List<Number> numberList = new ArrayList<>();
        for (Number number : number.getNumberList()) {
            String[] line = String.valueOf(number.getValue()).split("");
            if (predicates.test(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]))) {
                numberList.add(new Number(number.getValue()));
            }
        }
        return numberList;
    }

    interface Predicates {
        boolean test(int a, int b, int c);
    }
}