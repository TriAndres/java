package ru.yandex.practicum.lessonB.modelB.number;

public class Number {
    private int id;
    private int num;

    public Number(int num, int id) {
        this.num = num;
        this.id = id;
    }

    public Number(int num) {
        this.num = num;
    }

    public Number() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
