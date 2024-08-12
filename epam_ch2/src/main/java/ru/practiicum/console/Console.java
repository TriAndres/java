package ru.practiicum.console;

import java.util.Scanner;

public class Console {
    private final static Scanner scanner = new Scanner(System.in);
    public Console() {

    }

    public static int getInteger() {
        int a = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                break;
            } else {
                scanner.nextLine();
                System.out.println("Введите цифру:");
            }
        }
        return a;
    }

    public static double getDouble() {
        double a = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                a = scanner.nextDouble();
                break;
            } else {
                scanner.nextLine();
                System.out.println("Введите цифру:");
            }
        }
        return a;
    }

    public static int getIntegerFromTo(int from) {
        int num = 0;
        while (true) {
            num = getInteger();
           if (num >= from) {
               break;
           }
            System.out.println("Введите больше : " + from);
        }
        return num;
    }

    public static String getString() {
        return scanner.next();
    }
}