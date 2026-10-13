package com.example;

import java.util.ArrayList;
import java.util.List;

/* Zarządza kolekcją książek w bibliotece. */

public class LibraryService {
    private List<Book> books = new ArrayList<>();

    public void addBook(final Book book) {
        if (book != null) {
            books.add(book);
        }
    }

    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}