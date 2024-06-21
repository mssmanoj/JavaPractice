package basic.problems.oopschallenges.encapsulation.com.example.library;

public class Magazine extends LibraryItem {
    protected int issueNumber;

    public Magazine(int itemId, String title, String author, int issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issueNumber=" + issueNumber +
                ", itemId=" + itemId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
