```mermaid
classDiagram
    class Book {
        -String title
        -String author
        +Book(String title, String author)
        +getTitle() String
        +getAuthor() String
        +toString() String
    }

    class LibraryService {
        -List~Book~ books
        +addBook(Book book) void
        +printAllBooks() void
    }

    class Main {
        -Main()
        +main(String[] args)$ void
    }

    LibraryService "1" o-- "*" Book : zarządza
    Main ..> LibraryService : używa
    Main ..> Book : tworzy

    ``` CTRL + SHIFT + V