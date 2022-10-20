package com.company.fundamentals.task1;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println(resolve(0, 8));
        System.out.println(resolve(0, 0));
    }

    public static double resolve(double x, double y) {
        double numerator = 1.0D + Math.pow(Math.sin(x + y), 2.0D);
        double denominator = 2.0D + Math.abs(x - 2.0D * x / (1.0D + x * x + y * y));
        return numerator / denominator + x;
    }
}
