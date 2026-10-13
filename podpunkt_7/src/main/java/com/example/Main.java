package com.example;

/* Główna klasa aplikacji. */

public final class Main {

    private Main() {

    }

    public static void main(final String[] args) {
        LibraryService library = new LibraryService();
        
        library.addBook(new Book("Wiedzmin", "Andrzej Sapkowski"));
        library.addBook(new Book("Pan Tadeusz", "Adam Mickiewicz"));
        library.addBook(new Book("Lalka", "Henryk Sienkiewicz"));
        library.addBook(new Book("Zbrodnia i kara", "Fyodor Dostojewski"));
        library.addBook(new Book("Balladyna", "Juliusz Słowacki"));

        System.out.println("\n");

<<<<<<< HEAD
        System.out.println("Lista pozycji w bibliotece:");
=======
        System.out.println("Lista lektur w bibliotece:");
>>>>>>> 7fe8a66e80269222499159e9eae87d9369906f79
        library.printAllBooks();

        System.out.println("\n");
    }
}
