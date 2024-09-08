package ru.yandex.practicum.number.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.yandex.practicum.number.model.Numbers;
import ru.yandex.practicum.number.model.manage.ManageNumber;
import ru.yandex.practicum.number.model.method.NumberMethod;

import java.util.Collection;
import java.util.Random;

@Slf4j
@Service
@RequiredArgsConstructor
public class NumberService {
    private final ManageNumber manageNumber;
    private final NumberMethod numberMethod;

    public Collection<Numbers> findAll() {
        return manageNumber.findAll();
    }

    public Numbers create(Numbers numbers) {
        if (numbers.getNum() == null) {
            log.info("Вводная цифра null");
            throw new RuntimeException();
        }
        manageNumber.save(initNumbers(numbers));
        log.info("Записано create в список");
        return numbers;
    }

    public Collection<Numbers>  createListRandom(int size, int from, int to) {
        if (from > to) {
           log.info("from > to");
            throw new RuntimeException();
        }
        for (int i = 1; i <= size; i++) {
            manageNumber.save(initNumbers(new Numbers(from + new Random().nextInt(to - from))));
        }
        log.info("Записано createListRandom в список");
        return manageNumber.findAll();
    }





    private Numbers initNumbers(Numbers numbers) {
        numbers.setId(getNextId());
        numbers.setLength(String.valueOf(numbers.getNum()).length());
        numbers.setDifferentNum(numberMethod.differentNum(numbers));
        return numbers;
    }

    private Long getNextId() {
        return manageNumber.findAll()
                .stream()
                .mapToLong(Numbers::getId)
                .max()
                .orElse(0);
    }
}
