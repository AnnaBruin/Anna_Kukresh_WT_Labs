package com.company.classes_and_objects.Task13;

import com.company.classes_and_objects.Task12.Book;

public class ProgrammerBook extends Book
{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price,
                          int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString(){
        return super.toString()+ " (Language " + language + ", level: " + level + ")";
    }

    @Override
    public int hashCode(){
        return 31 * super.hashCode() * language.hashCode();
    }

    @Override
    public boolean equals(Object o){
        ProgrammerBook pBook = (ProgrammerBook)o;
        return super.equals(pBook) && (pBook.level == level);
    }
}
