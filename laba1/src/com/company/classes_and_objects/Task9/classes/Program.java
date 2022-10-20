package com.company.classes_and_objects.Task9.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        System.out.println("Task 9");

        ArrayList<Ball> balls = new ArrayList<>(Arrays.asList(
                new Ball(Color.BLUE, 0.2),
                new Ball(Color.BLACK, 0.3),
                new Ball(Color.RED, 0.1),
                new Ball(Color.BLUE, 0.2)
        ));
        Basket basket = new Basket(balls);

        System.out.println(basket.weight);
        System.out.println(basket.getColorCount(Color.BLUE));
    }
}
