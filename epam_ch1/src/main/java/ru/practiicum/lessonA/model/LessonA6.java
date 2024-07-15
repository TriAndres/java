package ru.practiicum.lessonA.model;

public class LessonA6 extends LessonA {
    public static void main(String[] args) {
        new LessonA6().game();
    }

    @Override
    public void game() {
        System.out.println("6. Вывести фамилию разработчика, дату и время получения задания, а также\n" +
                "дату и время сдачи задания.");

    }

    private void menu() {
        System.out.println("""
                \nВведите:
                
                - 0 (выход).
                """);
    }
}