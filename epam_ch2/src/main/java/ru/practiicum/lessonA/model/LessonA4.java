package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.Number;
import ru.practiicum.number.model.NumberManage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LessonA4 extends LessonA {
    public LessonA4(NumberManage numberManage) {
        super(numberManage);
    }


    public void game() {
        System.out.println("4. Найти число, в котором число различных цифр минимально. Если таких\n" +
                "чисел несколько, найти первое из них.");
        System.out.println("Ввод: id-num");
        showNum("0", 10, numberManage.getListNumbers());

        //differentNum(numberManage.getListNumbers());

        show(0, differentNumSort(numberManage.getListNumbers()));
    }

    public void differentNum() {
        Map<Integer, Integer> map = new HashMap<>();
        for (Number n : numberManage.getListNumbers()) {
            String[] a = String.valueOf(n.getNum()).split("");
            for (int i = 0; i < a.length; i++) {
                if (!map.containsKey(Integer.parseInt(a[i]))) {
                    map.put(Integer.parseInt(a[i]), 1);
                } else {
                    map.put(Integer.parseInt(a[i]), map.get(Integer.parseInt(a[i])) + 1);
                }
            }
            n.setDifferentNum(map.size());
            map.clear();
        }
    }

    private List<Number> differentNumSort(List<Number> numberList) {
        return numberList.stream().sorted((a, b) -> a.getDifferentNum() - b.getDifferentNum()).toList();
    }

    private void show(int id, List<Number> numbers) {
        System.out.println("id-" + numbers.get(id).getId() + " num-" + numbers.get(id).getNum() + " различных-" + numbers.get(id).getDifferentNum());
    }

}
