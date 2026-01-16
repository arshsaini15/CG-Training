package Jan_17_2026.Level1;

public class Book {
    private String title;
    private String author;
    private int price;

    Book() {
        System.out.println("Default constructor");
    }
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;

        System.out.println(this.title + " " + this.author + " " + this.price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Abc", "Def",3);
    }
}
