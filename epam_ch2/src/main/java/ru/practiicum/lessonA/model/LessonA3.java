package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.Number;
import ru.practiicum.number.model.NumberManage;

import java.util.List;

public class LessonA3 extends LessonA {
    public LessonA3(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("3. Вывести на консоль те числа, длина которых меньше (больше) средней,\n" +
                "а также длину.");
        System.out.println("Ввод: id-num");
        showNum("0", 10, numberManage.getListNumbers());
        setNumLength();

        System.out.println("Среднее: " + getAverage());

        System.out.println("Числа, длина которых меньше средней: num-length");
        showNum("1", 10, numLessAverage());


        System.out.println("Числа, длина которых больше средней: num-length");
        showNum("1", 10, numMoreAverage());

        numberManage.getListNumbers().clear();
    }

    private int getAverage() {
        int sum = numberManage.getListNumbers().stream().mapToInt(Number::getNum).sum();
        return sum / numberManage.getListNumbers().size();
    }

    private List<Number> numLessAverage() {
        return numberManage.getListNumbers().stream().filter(i -> getAverage() > i.getNum()).toList();
    }

    private List<Number> numMoreAverage() {
        return numberManage.getListNumbers().stream().filter(i -> getAverage() < i.getNum()).toList();
    }
}
