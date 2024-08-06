package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.Number;
import ru.practiicum.number.model.NumberManage;

import java.util.List;

public class LessonA1 extends LessonA{
    public LessonA1(NumberManage numberManage) {
        super(numberManage);
    }



    public void setNumLength(List<Number> list) {
        for (Number n : list) {
            n.setLength(String.valueOf(n.getNum()).length());
        }
    }

    public List<Number> numAscending(List<Number> list) {
        return list.stream().sorted((a, b) -> a.getNum() - b.getNum()).toList();
    }
}
