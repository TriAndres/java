package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.Number;
import ru.practiicum.number.model.NumberManage;

import java.util.ArrayList;
import java.util.List;

public class LessonA6 extends LessonA {
    public LessonA6(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("6. Найти число, цифры в котором идут в строгом порядке возрастания. Если\n" +
                "таких чисел несколько, найти первое из них.");
        System.out.println("Ввод: id-num");
        showNum("0", 10, numberManage.getListNumbers());

        System.out.println("Вывод: id-num");
        showNum("0", 10, num(numberManage.getListNumbers()));
    }

    private List<Number> num(List<Number> list) {
        List<Number> numberList = new ArrayList<>();
        for (Number number : numberManage.getListNumbers()) {
            String[] a = String.valueOf(number.getNum()).split("");
            boolean flag = false;
            int count = 1;
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (Integer.parseInt(a[i]) < Integer.parseInt(a[j])) flag = true;
                }
                if (flag) ++count;
            }
            if (flag && count == a.length) {
                numberList.add(number);
            }
        }
        return numberList;
    }
}
