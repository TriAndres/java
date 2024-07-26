package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.NumberManage;

public class LessonA2 extends LessonA{
    public LessonA2(NumberManage numberManage) {
        super(numberManage);
    }

    @Override
    public void game() {
        System.out.println("2. Упорядочить и вывести числа в порядке возрастания (убывания) значений\n" +
                "их длины.");
        System.out.println("Ввод:");
        showNum("1",10, numberManage.getListNumbers());
    }
}
