package com.company.classes_and_objects.Task16;

import com.company.classes_and_objects.Task12.Book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("C# 4.5","Herbert Schildt",450, 651000));
        books.add(new Book("clr via C#","Roman Nekliukov",42, 451013));
        books.add(new Book("clr via C#","Jeffrey Richter",1000, 451012));
        books.add(new Book("clr via C#","Aaron Ramsey",42, 451013));
        books.add(new Book("Visual basic fundamentals","Roman Nekliukov",5400, 451014));
        books.add(new Book("Visual basic fundamentals","Roman Nekliukov",4800, 451015));
        books.add(new Book("C# for professionals","John Skeet",2000, 991067));
        books.add(new Book("Delphi for beginners","Dmiriy Surkov",200, 391912));

        System.out.println("Random sequence of books");
        printCollection(books);
        System.out.println("Sort books by author");
        books.sort(new BooksComparator().byAuthor);
        printCollection(books);
        System.out.println("Sort books by title");
        books.sort(new BooksComparator().byTitle);
        printCollection(books);
        System.out.println("Sort books by author than by title");
        books.sort(new BooksComparator().byAuthorThanTitle);
        printCollection(books);
        System.out.println("Sort books by title than by author");
        books.sort(new BooksComparator().byTitleThanAuthor);
        printCollection(books);
        System.out.println("Sort books by author than by title than by price");
        books.sort(new BooksComparator().byAuthorThanTitleThanPrice);
        printCollection(books);
    }

    public static void printCollection(ArrayList<Book> books){
        for (Book book: books) {
            System.out.println(book.toString());
        }
        System.out.println();
    }
}
