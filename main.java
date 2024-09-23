public class Main {
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

        System.out.println("\nPrice Comparison:");
        System.out.println(parameteriziedBook1.comparePrice(parameteriziedBook2));
        System.out.println(parameteriziedBook2.comparePrice(defaultBook));
    }
}
