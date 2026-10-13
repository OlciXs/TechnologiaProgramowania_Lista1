package com.example;

/* Reprezentuje pojedynczą książkę w systemie. */

public class Book {
    private String title;
    private String author;

    public Book(final String title, final String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "'" + title + "' - " + author;
    }
}
