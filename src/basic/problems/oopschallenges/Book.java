package basic.problems.oopschallenges;

public class Book {
    String bookName;
    String author;
    int isbn=0;

    static int totalBooks=100;

    Book(){
        this.bookName="Naruto";
        this.author="Masashi Kishimoto";
        this.isbn++;
    }

    public void borrowBook(String name){
        totalBooks--;
        System.out.println("1 book is borrowed by:"+name);
    }

    public void returnBook(){
        totalBooks++;
        System.out.println("1 book is returned by:"+bookName);
    }

    public static int getTotalNumberOfbooks(){
        return totalBooks;
    }

}
