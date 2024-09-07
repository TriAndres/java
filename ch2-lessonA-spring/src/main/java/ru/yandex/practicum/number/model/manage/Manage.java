package ru.yandex.practicum.number.model.manage;

import ru.yandex.practicum.number.model.Number;

import java.util.Collection;

public interface Manage {
    Collection<Number> findAll();
    Number create(Number number);
    Number update(Number number);
    Long findById(Long id);
    void deleteById(Long id);
    void clear();
}
