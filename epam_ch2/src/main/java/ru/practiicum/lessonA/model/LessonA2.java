package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.Number;
import ru.practiicum.number.model.NumberManage;

import java.util.List;

public class LessonA2 extends LessonA{
    public LessonA2(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("2. Упорядочить и вывести числа в порядке возрастания (убывания) значений\n" +
                "их длины.");
        System.out.println("Ввод: id-num");
        showNum("0",10, numberManage.getListNumbers());
        setNumLength();

        System.out.println("Числа в порядке возрастания: num-length");
        showNum("2",10,numAscending(numberManage.getListNumbers()));

        System.out.println("Числа в порядке убывания: num-length");
        showNum("2",10,numDecreasing(numberManage.getListNumbers()));

        numberManage.getListNumbers().clear();
    }

    private List<Number> numAscending(List<Number> list) {
        return list.stream().sorted((a, b) -> a.getNum() - b.getNum()).toList();
    }

    private List<Number> numDecreasing(List<Number> list) {
        return list.stream().sorted((a, b) -> b.getNum() - a.getNum()).toList();
    }
}
