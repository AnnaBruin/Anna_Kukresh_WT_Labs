package com.company.fundamentals.Task7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Task 7");
        double[] initArray = { 3.14, -20, 0, 54.5, 10 };
        double[] result = shellSort(initArray);
        System.out.println(Arrays.toString(result));
    }

    public static double[] shellSort(double[] array) {
        int i = 0;
        while (i < array.length - 1){
            if (array[i] > array[i+1]){
                double temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
                if(i > 0)
                    i--;
            }
            else {
                i++;
            }
        }
        return array;
    }
}
