package ru.yandex.practicum.lessonB.modelB;

import ru.yandex.practicum.lessonB.modelB.number.Number;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MethodB {

    public void table(int from, int to) {
        for (int i = 2; i <= 9; i++) {
            for (int j = from; j <= to; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public List<Number> getListReverse(List<Number> list) {
        List<Number> numberList = new ArrayList<>();
        for (int i = list.size(); i > 0; i--) {
            numberList.add(new Number(list.get(i - 1).getId(), list.get(i - 1).getNum()));
        }
        return numberList;
    }

    public void showListNumber(int variant, int lineSize, List<Number> numberList) {
        int count = 0;
        for (int i = 0; i < numberList.size(); i++) {
            if (variant == 1) {
                System.out.print(numberList.get(i).getNum() + "\t");
            } else if (variant == 2) {
                System.out.print(numberList.get(i).getId() + "-" + numberList.get(i).getNum() + "\t");
            }
            ++count;
            if (count == lineSize) {
                System.out.println();
                count = 0;
            }
        }
    }

    public void devOnNum(int length, Predicate<Integer> predicate) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (predicate.test(i)) {
                System.out.print(i + " ");
                ++count;
            }
            if (count == length) {
                System.out.println();
                count = 0;
            }
        }
    }

    public int significantZeros(int decimal) {
        String num = "";
        int count = 0;
        while (decimal >= 1) {
            if (decimal % 2 == 0) {
                num += "0";
                count++;
            } else {
                num += "1";
            }
            decimal /= 2;
        }
        System.out.println(num);
        return count;
    }

    public void translatedNumbersFromTheDecimalSystem(int decimal, int system) {
        String num = "";
        int number = 0;
        while (decimal >= 1) {
            number = decimal % system;
            decimal = decimal / system;
            num += String.valueOf(number);
        }
        System.out.println(new StringBuffer().append(num).reverse());
    }

    public void month(int month) {
        switch (month) {
            case 1 :
                System.out.println("Январь");
                break;
            case 2 :
                System.out.println("Февраль");
                break;
            case 3 :
                System.out.println("Март");
                break;
            case 4 :
                System.out.println("Апрель");
                break;
            case 5 :
                System.out.println("Май");
                break;
            case 6 :
                System.out.println("Июнь");
                break;
            case 7 :
                System.out.println("Июль");
                break;
            case 8 :
                System.out.println("Август");
                break;
            case 9 :
                System.out.println("Сентябрь");
                break;
            case 10 :
                System.out.println("Октябрь");
                break;
            case 11 :
                System.out.println("Ноябрь");
                break;
            case 12 :
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Ввод от 1 до 12");
                break;
        }
    }
}