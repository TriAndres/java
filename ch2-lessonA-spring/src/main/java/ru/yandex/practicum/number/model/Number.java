package ru.yandex.practicum.number.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Number {
    private Long id;
    private Integer num;
    private Integer length;
    private Integer differentNum; //различных цифр
}
