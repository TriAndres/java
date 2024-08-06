package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.Number;
import ru.practiicum.number.model.NumberManage;

import java.util.ArrayList;
import java.util.List;

public class LessonA5 extends LessonA{
    public LessonA5(NumberManage numberManage) {
        super(numberManage);
    }


    public void game() {
        System.out.println("5. Найти количество чисел, содержащих только четные цифры, а среди них —\n" +
                "количество чисел с равным числом четных и нечетных цифр.");
        numberManage.setListNumRandom(20, 1000, 9999);
        System.out.println("Ввод: id-num");
        showNum("0", 10, numberManage.getListNumbers());

        System.out.println("Вывод: id-num");
        showNum("0", 10, num(numberManage.getListNumbers()));

    }

    private List<Number> num(List<Number> list) {
        List<Number> numberList = new ArrayList<>();
        for (Number n : numberManage.getListNumbers()) {
            if (n.getNum() % 2 == 0) {
                String[] a = String.valueOf(n.getNum()).split("");
                List<Integer> i1 = new ArrayList<>();
                List<Integer> i2 = new ArrayList<>();
                for (String s : a) {
                    if (Integer.parseInt(s) % 2 == 0) {
                        i1.add(Integer.parseInt(s));
                    }
                    if (Integer.parseInt(s) % 2 != 0) {
                        i2.add(Integer.parseInt(s));
                    }
                }
                if (i1.size() == i2.size()) {
                    numberList.add(n);
                }
            }
        }
        return numberList;
    }
}
