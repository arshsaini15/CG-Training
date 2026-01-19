package Inheritance_Jan_19_01_2026.SingleInheritance;

class Book {
    String title;
    int productionYear;

    Book(String title, int productionYear) {
        this.title = title;
        this.productionYear = productionYear;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Production Year: " + productionYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String name, String bio, String title, int productionYear) {
        super(title, productionYear);

        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Bio: " + bio);
        System.out.println("title: " + title);
        System.out.println("year: " + productionYear);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author("Alex", "Bio", "ABC", 2003);
        author.displayInfo();
    }
}
