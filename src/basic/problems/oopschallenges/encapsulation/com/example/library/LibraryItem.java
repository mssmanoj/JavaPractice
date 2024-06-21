package basic.problems.oopschallenges.encapsulation.com.example.library;

public class LibraryItem {
    protected int itemId;
    protected String title;
    protected String author;

    protected void checkout(){
        System.out.println("Checked Out");
    }

    protected void returnItem(){
        System.out.println("Returned!!");
    }

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

}
