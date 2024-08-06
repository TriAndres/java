package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.*;
import ru.practiicum.number.model.Number;

import java.util.List;

public abstract class LessonA {
    protected NumberManage numberManage;

    public LessonA(NumberManage numberManage) {
        this.numberManage = numberManage;
    }

    public void showNum(String s,int length, List<Number> list) {
        int count = 0;
        for (Number number : list) {
            switch (s) {
                case "0" -> System.out.print(number.getId() + "-" + number.getNum() + " ");
                case "1" -> System.out.print(number.getNum() + "-" + number.getLength() + " ");
            }
            ++count;
            if (count == length) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();
    }

    public  void setNumLength(List<Number> list){

    };
    public List<Number> numAscending(List<Number> list) {
        return null;
    };


}