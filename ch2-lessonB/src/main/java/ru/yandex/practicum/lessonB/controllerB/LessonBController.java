package ru.yandex.practicum.lessonB.controllerB;

import ru.yandex.practicum.lessonB.modelB.MethodB;
import ru.yandex.practicum.lessonB.modelB.number.NumberManage;


public class LessonBController {
    private final MethodB methodB;
    private final NumberManage numberManage;

    public LessonBController() {
        methodB = new MethodB();
        numberManage = new NumberManage();
    }

    public static void main(String[] args) {
        LessonBController l = new LessonBController();
        l.lesson3();
    }
    /*
Вариант B

4. Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
5. Сколько значащих нулей в двоичной записи числа 129?
6. В системе счисления с некоторым основанием десятичное число 81 запи
сывается в виде 100. Найти это основание.
7. Написать код программы, которая бы переводила числа из десятичной сис
темы счисления в любую другую.
8. Написать код программы, которая бы переводила числа одной любой сис
темы счисления в любую другую.
9. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствую
щего данному числу. Осуществить проверку корректности ввода чисел.
     */
    public void lesson1() {
        System.out.println("1. Вывести на экран таблицу умножения.");
        methodB.table(2,5);
        methodB.table(6,9);

    }

    public void lesson2() {
        numberManage.initArray(100);
        methodB.showListNumber(1,10, numberManage.getList());

        System.out.println("\n2. Вывести элементы массива в обратном порядке.");
        methodB.showListNumber(1,10, methodB.getListReverse(numberManage.getList()));
    }

    public void lesson3() {
        System.out.println("3. Определить принадлежность некоторого значения k интервалам (n, m], [n,\n" +
                "m), (n, m), [n, m].");
    }
}
