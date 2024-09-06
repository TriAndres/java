package ru.yandex.practicum.lessonB.controllerB;

import ru.yandex.practicum.lessonB.modelB.MethodB;
import ru.yandex.practicum.lessonB.modelB.interval.Interval;
import ru.yandex.practicum.lessonB.modelB.number.NumberManage;

import static ru.yandex.practicum.console.Console.getInteger;

public class LessonBController {
    private final MethodB methodB;
    private final NumberManage numberManage;
    private Interval interval;

    public LessonBController() {
        methodB = new MethodB();
        numberManage = new NumberManage();
    }

    public static void main(String[] args) {
        LessonBController l = new LessonBController();
        l.lesson7();
    }

    public void lesson1() {
        System.out.println("1. Вывести на экран таблицу умножения.");
        methodB.table(2,5);
        methodB.table(6,9);

    }

    public void lesson2() {
        numberManage.initArray(100);
        System.out.println("Ввод:");
        methodB.showListNumber(1,10, numberManage.getList());

        System.out.println("\n2. Вывести элементы массива в обратном порядке.");
        methodB.showListNumber(1,10, methodB.getListReverse(numberManage.getList()));
    }

    public void lesson3() {
        System.out.println("3. Определить принадлежность некоторого значения k интервалам (n, m], [n, m), (n, m), [n, m].");
        System.out.println("Круглые скобки (, ) обозначают, что граничное значение не включается в интервал\n" +
                "Квадратные скобки [, ] обозначают, что граничное значение включается в интервал");
        interval = new Interval(10, 3, 7);
        System.out.println("\nx ∈ (m, n] ⇔ m < x < n");
        interval.showValues("(n,m]");
        System.out.println("\n\nx ∈ [m, n) ⇔ m < x < n");
        interval.showValues("[n,m)");
        System.out.println("\n\nx ∈ (m, n) ⇔ m < x < n");
        interval.showValues("(n,m)");
        System.out.println("\n\nx ∈ [n, m] ⇔ m < x < n");
        interval.showValues("[n,m]");
    }

    public void lesson4() {
        System.out.println("4. Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.");
        methodB.devOnNum(10, i -> i % 3 == 0);
    }

    public void lesson5() {
        System.out.println("5. Сколько значащих нулей в двоичной записи числа 129?");
        System.out.println(methodB.significantZeros(129));
    }

    public void lesson6() {
        System.out.println("6. В системе счисления с некоторым основанием десятичное число 81 \n" +
                "записывается в виде 100. Найти это основание.");
        System.out.println("0*9^0+0*9^1+1*9^2=81;\n" +
                "100(9);\n" +
                "Основание 9.");
    }

    public void lesson7() {
        System.out.println("7. Написать код программы, которая бы переводила числа из десятичной системы \n" +
                "счисления в любую другую.");
        System.out.println("Введите число в десятичной системе: к примеру 129");
        int number = getInteger(0);
        System.out.println("В какую систему преобразовать: 2, 8, 16 или в любую другую.");
        int system = getInteger(0);
        methodB.translatedNumbersFromTheDecimalSystem(number, system);
    }

    public void lesson8() {
        System.out.println("8. Написать код программы, которая бы переводила числа одной любой\n" +
                " системы счисления в любую другую.");
    }

    public void lesson9() {
        System.out.println("9. Ввести число от 1 до 12. Вывести на консоль название месяца, \n" +
                "соответствующего данному числу. Осуществить проверку корректности ввода чисел.");
    }

}
