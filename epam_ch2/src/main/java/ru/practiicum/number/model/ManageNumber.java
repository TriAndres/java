package ru.practiicum.number.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ManageNumber {
    private final Map<Integer, Number> numberMap = new HashMap<>();
    private static int id;

    private int getId() {
        return ++id;
    }

    public Collection<Number> getNumbers() {
        return numberMap.values();
    }

    public void save(Number number) {
        number.setId(getId());
        numberMap.put(number.getId(), number);
    }

    public void update(Number number) {
        if (number.getId() <= numberMap.size() && number.getId() > 0) {
            numberMap.put(number.getId(), number);
        }
    }

    public Number getById(int id) {
        if (numberMap.containsKey(id)) {
            return numberMap.get(id);
        }
        return  null;
    }

    public void deleteById(int id) {
        numberMap.remove(id);
    }

    public void setListNumRandom(int size, int from, int to) {
        if (from < to) {
            for (int i = 1; i <= size; i++) {
                save(new Number(from + new Random().nextInt(to - from)));
            }
        }
    }
}