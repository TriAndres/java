package ru.practiicum.number.model;

public class Number {
    private int id;
    private int num;
    private int length;

    public Number(int id, int num) {
        this.id = id;
        this.num = num;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
