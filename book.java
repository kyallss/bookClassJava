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
    // Main method to test the class
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book parameteriziedBook1 = new Book("Great Expectations", "Charles Dickens", "9781435171640", 45);
        Book parameteriziedBook2 = new Book("Old Mortality", "Walter Scott", "99780199555307", 40);

        System.out.println("Default Book:");
        defaultBook.displayInfo();

        System.out.println("\nParameterizied Book 1:");
        parameteriziedBook1.displayInfo();

        System.out.println("\nParameterizied Book 2:");
        parameteriziedBook2.displayInfo();

        // Comparing prices
        System.out.println("\nPrice Comparison:");
        System.out.println(parameteriziedBook1.comparePrice(parameteriziedBook2));
        System.out.println(parameteriziedBook2.comparePrice(defaultBook));
    }
}
