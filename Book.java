public class Book {

    public String toString() {
        return "This is the Book class.";
    }

    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.toString()); // In ra: This is the Book class.
    }
}
