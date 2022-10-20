package com.company.classes_and_objects.Task12;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 13");

        Book firstBook = new Book("C# 4.5","Herbert Schildt",
                500, 651000);
        Book secondBook = firstBook.clone();

        System.out.println(firstBook);
        System.out.println(firstBook.hashCode());
        System.out.println(firstBook.equals(secondBook));

        TreeSet<Book> bookSet = new TreeSet<>();
        bookSet.add(new Book("C# 4.5","Herbert Schildt",450, 651000));
        bookSet.add(new Book("clr via C#","Jeffrey Richter",1000, 451012));
        bookSet.add(new Book("C# for professionals","John Skeet",2000, 991067));
        bookSet.add(new Book("Delphi for beginners","Dmiriy Surkov",200, 391912));

        for (Book book: bookSet) {
            System.out.println(book.toString());
        }
    }
}
