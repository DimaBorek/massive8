package com.company;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        int array1[] = new int[10];
        int array2[] = new int[10];
        double array3[] = new double[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = (int) (Math.random() * 9 + 1);
            array2[i] = (int) (Math.random() * 9 + 1);
            array3[i] = Math.round(((double) array1[i] / (double) array2[i]) * 100.0) / 100.0;
            if (array3[i] == (int) array3[i])
                counter++;
        }
        for (int i = 0; i < 10; i++)
            System.out.print(array1[i] + "\t");
        System.out.println();
        for (int i = 0; i < 10; i++)
            System.out.print(array2[i] + "\t");
        System.out.println();
        for (int i = 0; i < 10; i++)
            System.out.print(array3[i] + "\t");
        System.out.println("\n" + counter);
    }
}
