package com.company.classes_and_objects.Task13;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 13");

        ProgrammerBook firstBook = new ProgrammerBook("C# 4.5","Herbert Schildt",
                500, 651000, "C#", 1);
        ProgrammerBook secondBook = new ProgrammerBook("C# 4.5","Herbert Schildt",
                350, 651001,"C#", 1);

        System.out.println(firstBook);
        System.out.println(firstBook.hashCode());
        System.out.println(firstBook.equals(secondBook));
    }
}
