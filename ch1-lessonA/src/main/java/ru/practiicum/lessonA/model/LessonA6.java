package ru.practiicum.lessonA.model;

import ru.practiicum.user.User;

import static ru.practiicum.console.Console.getInteger;
import static ru.practiicum.console.Console.getString;

public class LessonA6 extends LessonA {
    public static void main(String[] args) {
        new LessonA6().game();
    }

    @Override
    public void game() {
        System.out.println("6. Вывести фамилию разработчика, дату и время получения задания, а также\n" +
                "дату и время сдачи задания.");
        User user = new User();
        while (true) {
            menu();
            user.setLastName(getString());
            if (user.getLastName().equals("0")) {
                break;
            }
            System.out.println("фамилию разработчика, дату и время получения задания:\n" +
                     user.getLastName() + " / " + user.getLocalDateTime());
            System.out.println("Через сколько дней сдадите задание:");
            int day = getInteger();
            System.out.println("фамилию разработчика, дату и время сдачи задания, через " + day + " дней\n" +
                    user.getLastName() + " / " + user.getLocalDateTimePlusDay(day));
        }
        System.out.println("Вышли из программы");
    }
    @Override
    public void menu() {
        System.out.println("""
                Введите:
                - Фамилию
                - 0 (выход)
                """);
    }
}