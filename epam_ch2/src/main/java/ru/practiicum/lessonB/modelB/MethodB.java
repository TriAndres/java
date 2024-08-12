package ru.practiicum.lessonB.modelB;

public class MethodB {

    public void table(int from, int to) {
        for (int i = 2; i <= 9; i++) {
            for (int j = from; j <= to; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
