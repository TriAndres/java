package ru.yandex.practicum.lessonB.modelB.number;

import java.util.ArrayList;
import java.util.List;

public class NumberManage {
    private final List<Number> list = new ArrayList<>();
    private int id;

    public int getId() {
        return ++id;
    }

    public List<Number> getList() {
        return list;
    }


    public void initArray(int size) {
        for (int i = 1; i <= size; i++) {
            add(new Number(i));
        }
    }

    public void add(Number number) {
        number.setId(getId());
        list.add(number);
    }
}