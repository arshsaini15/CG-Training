package Jan_22_01_2026.AssistedProblems;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            System.out.println(" - " + book);
        }
    }
}


public class LibraryAndBooks {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("Clean Code", "Robert C. Martin");

        Library cityLibrary = new Library("City Library");
        Library collegeLibrary = new Library("College Library");

        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        collegeLibrary.addBook(book2);

        cityLibrary.showBooks();
        collegeLibrary.showBooks();
    }
}
