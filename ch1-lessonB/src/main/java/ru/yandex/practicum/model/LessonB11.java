package ru.yandex.practicum.lessonB.model;

import ru.yandex.practicum.number.ManageNumber;
import ru.yandex.practicum.number.Number;

import java.util.ArrayList;
import java.util.List;

public class LessonB11 extends LessonB {
    public LessonB11(ManageNumber manageNumber) {
        super(manageNumber);
    }

    @Override
    public void game() {
        System.out.println("11. Элементы, которые равны полусумме соседних элементов.");
        numAllShow(20, 10, 99, 5);
        System.out.println("Элементы, которые равны полусумме соседних элементов:");
        manageNumber.show(5,numHalfASum(manageNumber.getNumberList()));
        manageNumber.getNumberList().clear();
    }

    public List<Number> numHalfASum(List<Number> list) {
        List<Number> numberList = new ArrayList<>();
        for (int i = 1; i < list.size() - 1; i++) {
            int num = (list.get(i - 1).getValue() + list.get(i + 1).getValue()) / 2;
            if (num == list.get(i).getValue()) {
                System.out.println(manageNumber.getNumberList().get(i).getValue() + " ");
                numberList.add(new Number(list.get(i).getValue()));
            }
        }
        return numberList;
    }
}