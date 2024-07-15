package ru.practiicum.lessonA.model;

public class LessonA5 extends LessonA {
    public static void main(String[] args) {
        new LessonA5().game();
    }

    @Override
    public void game() {
        System.out.println("5. Ввести целые числа как аргументы командной строки, подсчитать их сум\n" +
                "мы и произведения. Вывести результат на консоль.");

    }

    private void menu() {
        System.out.println("""
                \nВведите:
                - Число.
                - 0 (выход).
                """);
    }
}