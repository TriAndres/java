package ru.practiicum.lessonA.lessonA.controllerA;

import ru.practiicum.console.Console;
import ru.practiicum.lessonA.lessonA.modelA.*;
import ru.practiicum.lessonA.number.model.Number;
import ru.practiicum.lessonA.number.model.NumberManage;

import java.util.List;

public class LessonAController {
    private final NumberManage numberManage;
    private final MethodA lessonA;
    private final NumberSort numberSort;
    private final Equation equation;

    public LessonAController(NumberManage numberManage) {
        this.numberManage = numberManage;
        lessonA = new MethodA();
        numberSort = new NumberSort();
        equation = new Equation();
    }


    public void lesson1() {
        System.out.println("1. Найти самое короткое и самое длинное число. Вывести найденные числа\n" +
                "и их длину.");

        System.out.println("Ввод: id-num");
        lessonA.showNum("0",10, numberManage.getListNumbers());

        List<Number> num = numberSort.sortNumAscending(numberManage.getListNumbers());

        System.out.println("Число самое короткое: num-length\n" + num.getFirst().getNum() + "-" + num.getFirst().getLength());

        System.out.println("Число самое длинное: num-length\n" + num.getLast().getNum() + "-" + num.getLast().getLength());

        numberManage.getListNumbers().clear();
    }

    public void lesson2() {
        System.out.println("2. Упорядочить и вывести числа в порядке возрастания (убывания) значений\n" +
                "их длины.");
        System.out.println("Ввод: id-num");
        lessonA.showNum("0",10, numberManage.getListNumbers());

        System.out.println("Числа в порядке возрастания: num-length");
        lessonA.showNum("1",10,numberSort.sortNumAscending(numberManage.getListNumbers()));

        System.out.println("Числа в порядке убывания: num-length");
        lessonA.showNum("1",10,numberSort.sortNumDecreasing(numberManage.getListNumbers()));

        numberManage.getListNumbers().clear();
    }

    public void lesson3() {
        System.out.println("3. Вывести на консоль те числа, длина которых меньше (больше) средней,\n" +
                "а также длину.");
        System.out.println("Ввод: id-num");
        lessonA.showNum("0", 10, numberManage.getListNumbers());

        System.out.println("Среднее: " + lessonA.getAverage(numberManage.getListNumbers()));

        System.out.println("Числа, длина которых меньше средней: num-length");
        lessonA.showNum("1", 10, lessonA.numMinAverage(numberManage.getListNumbers()));


        System.out.println("Числа, длина которых больше средней: num-length");
        lessonA.showNum("1", 10, lessonA.numMaxAverage(numberManage.getListNumbers()));

        numberManage.getListNumbers().clear();
    }

    public void lesson4() {
        System.out.println("4. Найти число, в котором число различных цифр минимально. Если таких\n" +
                "чисел несколько, найти первое из них.");
        System.out.println("Ввод: id-num");
        lessonA.showNum("0", 10, numberManage.getListNumbers());

        lessonA.showDifferentNum(0, numberSort.sortDifferentAscending(numberManage.getListNumbers()));
    }

    public void lesson5() {
        System.out.println("5. Найти количество чисел, содержащих только четные цифры, а среди них —\n" +
                "количество чисел с равным числом четных и нечетных цифр.");
        System.out.println("Ввод: id-num");
        lessonA.showNum("0", 10, numberManage.getListNumbers());

        System.out.println("Вывод: id-num");
        lessonA.showNum("0", 10, lessonA.numLessonA5(numberManage.getListNumbers()));
    }

    public void lesson6() {
        System.out.println("6. Найти число, цифры в котором идут в строгом порядке возрастания. Если\n" +
                "таких чисел несколько, найти первое из них.");
        System.out.println("Ввод: id-num");
        lessonA.showNum("0",10, numberManage.getListNumbers());

        System.out.println("Вывод: id-num");
        lessonA.showNum("0", 10, lessonA.numLessonA6(numberManage.getListNumbers()));
    }

    public void lesson7() {
        System.out.println("7. Найти число, состоящее только из различных цифр. Если таких чисел не\n" +
                "сколько, найти первое из них.");
        System.out.println("Ввод:");
        lessonA.showNum("1",10, numberManage.getListNumbers());
    }

    public void lesson8() {
        System.out.println("8. Среди чисел найти число-палиндром. Если таких чисел больше одного,\n" +
                "найти второе.");
        System.out.println("Ввод:");
        lessonA.showNum("1",10, numberManage.getListNumbers());
    }

    public void lesson9() {
        System.out.println("9. Найти корни квадратного уравнения. Параметры уравнения передавать\n" +
                "с командной строкой.");

        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a:");
        double a = Console.getDouble();
        System.out.println("Введите b:");
        double b = Console.getDouble();
        System.out.println("Введите c:");
        double c = Console.getDouble();
        equation.setEquation(a, b, c);
        equation.getEquationDecision();
    }
}
