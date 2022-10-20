package com.company.fundamentals.task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Task 2");
        System.out.println(isInArea(0, 0));
        System.out.println(isInArea(2, 9));
        System.out.println(isInArea(-3, 2));
    }

    public static boolean isInArea(double x, double y){
        int numX1 = 4, numX2 = 6, numY1 = 5, numY2 = -3;

        if ((Math.abs(x) <= numX1 && Math.abs(x) >= 0) && (y <= numY1 && y >= 0)){
            return true;
        }

        return (Math.abs(x) <= numX2 && Math.abs(x) >= 0) && (y >= numY2 && y <= 0);
    }
}
