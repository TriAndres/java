package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.Number;
import ru.practiicum.number.model.NumberManage;

import java.util.List;

public class LessonA1 extends LessonA{
    public LessonA1(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("1. Найти самое короткое и самое длинное число. Вывести найденные числа\n" +
                "и их длину.");
        System.out.println("Ввод: id-num");
        showNum("0",10, numberManage.getListNumbers());
        setNumLength();

        List<Number> num = numAscending(numberManage.getListNumbers());
        System.out.println("Число самое короткое: num-length\n" + num.get(1).getNum() + "-" + num.get(1).getLength());

        System.out.println("Число самое длинное: num-length\n" + num.get(num.size()-1).getNum() + "-" + num.get(num.size()-1).getLength());

        numberManage.getListNumbers().clear();
    }

    private List<Number> numAscending(List<Number> list) {
        return list.stream().sorted((a, b) -> a.getNum() - b.getNum()).toList();
    }
}
