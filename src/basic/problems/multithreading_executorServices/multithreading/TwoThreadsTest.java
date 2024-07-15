package basic.problems.multithreading_executorServices.multithreading;

public class TwoThreadsTest {
    public static void main(String[] args) {
        TwoThreads t1 = new TwoThreads();
        TwoThreads t2 = new TwoThreads();


        t1.start();
        t2.start();
    }
}
