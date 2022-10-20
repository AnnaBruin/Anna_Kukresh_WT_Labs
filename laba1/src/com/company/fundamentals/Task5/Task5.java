package com.company.fundamentals.Task5;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Task 5");
        int number = unnecessaryNumbersCount(new int[] { 35, 2, 69, 5, 3, 200 });
        System.out.println(number);
    }

    public static int unnecessaryNumbersCount(int[] initialArray) {
        if (initialArray.length == 1){
            return 0;
        }

        return countNumbers(initialArray);
    }

    private static int countNumbers(int[] numbers){
        int resultCount = 0, currMaxNumber = numbers[0];
        for(int i = 0; i < numbers.length - 1; i++){
            if (numbers[i + 1] <= currMaxNumber){
                resultCount++;
            }
            else{
                currMaxNumber = numbers[i + 1];
            }
        }

        return resultCount;
    }
}
