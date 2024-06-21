package basic.problems.oopschallenges.encapsulation.com.example.library;

public class DVD extends LibraryItem {
    protected int duration;

    public DVD(int itemId, String title, String author, int duration) {
        super(itemId, title, author);
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "duration=" + duration +
                ", itemId=" + itemId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
