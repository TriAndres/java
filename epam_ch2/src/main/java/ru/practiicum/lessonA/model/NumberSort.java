package ru.practiicum.lessonA.model;

import ru.practiicum.number.model.Number;

import java.util.List;

public class NumberSort {
    public List<Number> sortNumAscending(List<Number> list) {
        return list.stream().sorted((a, b) -> a.getNum() - b.getNum()).toList();
    }

    public List<Number> sortNumDecreasing(List<Number> list) {
        return list.stream().sorted((a, b) -> b.getNum() - a.getNum()).toList();
    }

    public List<Number> sortDifferentAscending(List<Number> numberList) {
        return numberList.stream().sorted((a, b) -> a.getDifferentNum() - b.getDifferentNum()).toList();
    }
}
