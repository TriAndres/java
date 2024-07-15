package ru.practiicum.console;

import java.util.Scanner;

public  class Console {
    private static Scanner sc = new Scanner(System.in);
    public static int getInteger() {
        int a = 0;
        while (true) {
            if (sc.hasNextInt()) {
                System.out.println("цифра");
                a = sc.nextInt();
                break;
            } else {
                sc.nextLine();
            }
        }
        return a;
    }

    public static String getString() {
        return sc.nextLine();
    }
}
