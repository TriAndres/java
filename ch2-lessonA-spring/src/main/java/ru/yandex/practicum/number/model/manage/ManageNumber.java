package ru.yandex.practicum.number.model.manage;

import ru.yandex.practicum.number.model.Number;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageNumber implements Manage{
    private final Map<Long, Number> numbers = new HashMap<>();

    @Override
    public Collection<Number> findAll() {
        return List.of();
    }

    @Override
    public Number create(Number number) {
        return null;
    }

    @Override
    public Number update(Number number) {
        return null;
    }

    @Override
    public Long findById(Long id) {
        return 0l;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void clear() {

    }

    public Long getNextId() {
        Long maxId = numbers.keySet()
                .stream()
                .mapToLong(id -> id)
                .max()
                .orElse(0);
        return maxId;
    }
}
