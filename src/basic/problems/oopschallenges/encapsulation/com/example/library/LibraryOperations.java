package basic.problems.oopschallenges.encapsulation.com.example.library;

public class LibraryOperations {
    public static void main(String[] args) {
        Book book = new Book(1, "Java", "gosling", 01);
        System.out.println(book.toString());
        book.checkout();
        book.returnItem();
    }
}
