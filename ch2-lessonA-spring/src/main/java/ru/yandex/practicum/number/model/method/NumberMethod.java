package ru.yandex.practicum.number.model.method;

import ru.yandex.practicum.number.model.Numbers;

import java.util.HashMap;
import java.util.Map;

public class NumberMethod {

    public  int differentNum(Numbers numbers) {
        Map<Integer, Integer> map = new HashMap<>();
            String[] a = String.valueOf(numbers.getNum()).split("");
        for (String s : a) {
            if (!map.containsKey(Integer.parseInt(s))) {
                map.put(Integer.parseInt(s), 1);
            } else {
                map.put(Integer.parseInt(s), map.get(Integer.parseInt(s)) + 1);
            }
        }
            numbers.setDifferentNum(map.size());
            map.clear();
        return 0;
    }
}
