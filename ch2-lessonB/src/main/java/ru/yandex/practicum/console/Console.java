package ru.yandex.practicum.console;

import java.util.Scanner;

public class Console {
    private final static Scanner scanner = new Scanner(System.in);

    public static Integer getInteger(int setpoint) {
        int number = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > setpoint) {
                    break;
                } else {
                    System.out.println("Запишите число болше " + setpoint);
                }
            } else {
                scanner.nextLine();
            }
        }
        return number;
    }

    public static String getString() {
        return scanner.next();
    }
}
