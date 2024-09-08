package ru.yandex.practicum.number.model.manage;

import ru.yandex.practicum.number.model.Numbers;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageNumber implements Manage{
    private final Map<Long, Numbers> numbersMap = new HashMap<>();

    @Override
    public Collection<Numbers> findAll() {
        return List.of();
    }

    @Override
    public Numbers save(Numbers numbers) {
        return numbersMap.put(numbers.getId(), numbers);
    }

    @Override
    public Numbers findById(Long id) {
        return numbersMap.get(id);
    }

    @Override
    public Numbers deleteById(Long id) {
        return numbersMap.get(id);
    }

    @Override
    public void clear() {
        numbersMap.clear();
    }
}