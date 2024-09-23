public class Book {
    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Book() {
        this.title = " ";
        this.author = " ";
        this.ISBN = " ";
        this.price = 0;
    }

    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: " + price);
    }

    // Method to compare the price of two books
    public String comparePrice(Book otherBook) {
        if (this.price>otherBook.price) {
            return this.title + " is more expensive than " + otherBook.title;
        } else if (this.price<otherBook.price) {
            return this.title + " is cheaper than " + otherBook.title;
        } else {
            return this.title + " and " + otherBook.title + " have the same price.";
        }
    }
  
