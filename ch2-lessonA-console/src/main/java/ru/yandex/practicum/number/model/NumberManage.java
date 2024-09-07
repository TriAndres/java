package ru.yandex.practicum.number.model;

import java.util.*;

public class NumberManage implements Manager {
    private final Map<Integer, Number> numberMap = new HashMap<>();
    private static int id;

    @Override
    public int getId() {
        return ++id;
    }

    @Override
    public List<Number> getListNumbers() {
        return new ArrayList<>(numberMap.values());
    }

    @Override
    public void save(Number number) {
        number.setId(getId());
        numberMap.put(number.getId(), number);
    }

    @Override
    public void update(Number number) {
        int max = numberMap.values().stream().map(i -> i.getNum()).max(Integer::compare).get();
        if (number.getId() >= 1 && number.getId() <= max) {
            System.out.println("обновлён.");
            numberMap.put(number.getId(), number);
        } else {
            System.out.println("с таким id цифры нет");
        }
    }

    @Override
    public Number getById(int id) {
        if (numberMap.containsKey(id)) {
            return numberMap.get(id);
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        if (numberMap.containsKey(id)) {
            numberMap.remove(id);
        }
    }

    @Override
    public void clear() {
        numberMap.clear();
    }

    @Override
    public void setListNumRandom(int size, int from, int to) {
        if (from < to) {
            for (int i = 1; i <= size; i++) {
                save(new Number(from + new Random().nextInt(to - from)));
            }
        }
    }
}