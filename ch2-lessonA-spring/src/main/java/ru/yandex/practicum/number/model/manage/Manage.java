package ru.yandex.practicum.number.model.manage;

import ru.yandex.practicum.number.model.Numbers;

import java.util.Collection;

public interface Manage {
    Collection<Numbers> findAll();
    Numbers save(Numbers number);
    Numbers findById(Long id);
    Numbers deleteById(Long id);
    void clear();
}
