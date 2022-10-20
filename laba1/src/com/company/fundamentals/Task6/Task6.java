package com.company.fundamentals.Task6;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Task 6");
        double[] initArray = { 3, 22, 45.1, -3, 200 };
        Double[][] result = generateMatrix(initArray);
        System.out.println(Arrays.deepToString(result));
    }

    public static Double[][] generateMatrix(double[] initArray) {
        Double[] newArray = Arrays.stream(initArray).boxed().toArray(Double[]::new);
        return generateMatrix(newArray);
    }

    public static Double[][] generateMatrix(Double[] initArray) {
        LinkedList<Double> numbers = new LinkedList<>();
        FillQueue(initArray, numbers);

        Double[][] resultMatrix = new Double[initArray.length][initArray.length];
        CreateMatrix(resultMatrix, numbers);

        return resultMatrix;
    }

    private static void FillQueue(Double[] source, Queue<Double> dest){
        Collections.addAll(dest, source);
    }

    private static void CreateMatrix(Double[][] resultMatrix, Queue<Double> initQueue){
        for (int i = 0; i < initQueue.size(); i++) {
            resultMatrix[i] = initQueue.toArray(new Double[0]);
            initQueue.add(initQueue.element());
            initQueue.remove();
        }
    }
}
