package basic.problems.oopschallenges.encapsulation.com.example.library;

public class Book extends LibraryItem {
    protected int ISBN;

    public Book(int itemId, String title, String author, int ISBN) {
        super(itemId, title, author);
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", itemId=" + itemId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
