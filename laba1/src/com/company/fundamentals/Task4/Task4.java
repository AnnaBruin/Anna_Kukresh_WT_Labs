package com.company.fundamentals.Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Task 4");
        int[] primes = getIndexesOfPrimeNumbers(new int[] { 33, 17, 23, 55, 12, 1, 9, 20, 7 });
        System.out.println(Arrays.toString(primes));
    }

    public static int[] getIndexesOfPrimeNumbers(int[] initArray){
        ArrayList<Integer> primesIndexes = new ArrayList<>();
        findIndexes(initArray, primesIndexes);
        return primesIndexes.stream().mapToInt(i -> i).toArray();
    }

    public static boolean isPrime(int number){
        if (number == 1){
            return true;
        }

        double numberRoot = Math.sqrt(number);
        for (int i = 2; i <= numberRoot; i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    private static boolean findIndexes(int[] numbers, ArrayList<Integer> primesIndexes){
        boolean isPrimeExists = false;
        for(int i = 0; i < numbers.length; i++){
            if(isPrime(numbers[i])){
                primesIndexes.add(i);
                isPrimeExists = true;
            }
        }

        return isPrimeExists;
    }
}
