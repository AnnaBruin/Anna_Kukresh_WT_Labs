package com.company.fundamentals.Task3;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Task 3");
        printTable(0, 10, 1);
    }

    public static double[][] resolveInRange(double a, double b, double h) {
        int tableSize = (int)((b - a) / h);
        double[][] resultTable = new double[2][tableSize];
        int i = 0;
        while (i < tableSize){
            resultTable[0][i] = a;
            resultTable[1][i++] = Math.tan(a);
            a += h;
        }

        return resultTable;
    }

    public static void printTable(double a, double b, double h) {
        double[][] table = resolveInRange(a, b, h);

        int size = table[0].length;

        for (int i = 0; i < size; i++) {
            System.out.println(String.format("%.3f",table[0][i]) + " | " + String.format("%.3f",table[1][i]));
            System.out.println("------------");
        }

    }
}
