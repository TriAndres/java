package ru.yandex.practicum.lessonB.modelB;

import ru.yandex.practicum.lessonB.modelB.number.Number;

import java.util.ArrayList;
import java.util.List;

public class MethodB {

    public void table(int from, int to) {
        for (int i = 2; i <= 9; i++) {
            for (int j = from; j <= to; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public List<Number> getListReverse(List<Number> list) {
        List<Number> numberList = new ArrayList<>();
        for (int i = list.size(); i > 0 ; i--) {
            numberList.add(new Number(list.get(i - 1).getId(),list.get(i - 1).getNum()));
        }
        return numberList;
    }

    public void showListNumber(int variant,int lineSize, List<Number> numberList) {
        int count = 0;
        for (int i = 0; i < numberList.size() ; i++) {
            if (variant == 1) {
                System.out.print(numberList.get(i).getNum() + "\t");
            } else if (variant == 2) {
                System.out.print(numberList.get(i).getId() + "-" + numberList.get(i).getNum() + "\t");
            }
            ++count;
            if (count == lineSize) {
                System.out.println();
                count = 0;
            }
        }
    }
}
