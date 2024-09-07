package ru.yandex.practicum.number.model;

public class Number {
    private Integer id;
    private Integer num;
    private Integer length;
    private Integer differentNum; //различных цифр

    public Number() {
    }

    public Number(Integer num) {
        this.num = num;
    }

    public Number(Integer id, Integer num) {
        this.id = id;
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getDifferentNum() {
        return differentNum;
    }

    public void setDifferentNum(Integer differentNum) {
        this.differentNum = differentNum;
    }
}
