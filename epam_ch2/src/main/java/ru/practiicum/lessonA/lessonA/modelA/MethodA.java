package ru.practiicum.lessonA.lessonA.modelA;

import ru.practiicum.lessonA.number.model.Number;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodA {


    public MethodA() {
    }

    public void setNumLength(List<Number> list) {
        for (Number n : list) {
            n.setLength(String.valueOf(n.getNum()).length());
        }
    }

    public void showNum(String s, int length, List<Number> list) {
        int count = 0;
        for (Number number : list) {
            switch (s) {
                case "0" -> System.out.print(number.getId() + "-" + number.getNum() + " ");
                case "1" -> System.out.print(number.getNum() + "-" + number.getLength() + " ");
            }
            ++count;
            if (count == length) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();
    }

    public int getAverage(List<Number> list) {
        int sum = list.stream().mapToInt(Number::getNum).sum();
        return sum / list.size();
    }

    public List<Number> numMinAverage(List<Number> list) {
        return list.stream().filter(i -> getAverage(list) > i.getNum()).toList();
    }

    public List<Number> numMaxAverage(List<Number> list) {
        return list.stream().filter(i -> getAverage(list) < i.getNum()).toList();
    }

    public void differentNum(List<Number> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Number n : list) {
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



    public void showDifferentNum(int id, List<Number> numbers) {
        System.out.println("id-" + numbers.get(id).getId() + " num-" + numbers.get(id).getNum() + " различных-" + numbers.get(id).getDifferentNum());
    }

    public List<Number> numLessonA5(List<Number> list) {
        List<Number> numberList = new ArrayList<>();
        for (Number n : list) {
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

    public List<Number> numLessonA6(List<Number> list) {
        List<Number> numberList = new ArrayList<>();
        for (Number number : list) {
            String[] s = String.valueOf(number.getNum()).split("");
            int count = 1;
            boolean flag = false;
            for (int i = 0; i < s.length - 1; i++) {
                flag = false;
                for (int j = i + 1; j < s.length; j++) {
                    if (Integer.parseInt(s[i]) < Integer.parseInt(s[j])) flag = true;
                }
                if (flag) ++count;
            }
            if (flag && count == s.length) {
                numberList.add(new Number(number.getId(), number.getNum()));
            }
        }
        return numberList;
    }

}
