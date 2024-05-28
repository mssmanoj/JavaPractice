package basic.problems.oopschallenges;

public class BookDriver {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("Available books:");
        System.out.println("Book Name:"+book.bookName);
        System.out.println("Author:"+book.author);
        System.out.println("isbn:"+book.isbn);
        book.borrowBook("Manoj");
        System.out.println("No of Available books:"+Book.totalBooks);
    }
}
