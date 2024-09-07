package ru.yandex.practicum.lessonA.modelA;

public class Equation {
    private double a;
    private double b;
    private double c;

    public Equation() {
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void getEquationDecision() {
       double D;
       D = b * b - 4 * a * c;
       if (D > 0) {
           double x1;
           double x2;
           x1 = (-b - Math.sqrt(D)) / (2 * a);
           x2 = (-b + Math.sqrt(D)) / (2 * a);
           System.out.println("Корень уравнения: х1 = " + x1 + ", х2 = " + x2);
       } else if (D == 0) {
           double x;
           x = -b / (2 * a);
           System.out.println("Уравнение имеет единственный корень: х = " + x);
       } else {
           System.out.println("Уравнение не имеет дествительных корней!");
       }
    }

    public void setEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


}
