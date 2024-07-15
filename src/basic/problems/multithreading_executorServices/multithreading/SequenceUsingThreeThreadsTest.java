package basic.problems.multithreading_executorServices.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceUsingThreeThreadsTest {
    private int count = 1;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {

        SequenceUsingThreeThreadsTest s = new SequenceUsingThreeThreadsTest();

        Thread t1 = new Thread(new SequenceUsingThreeThreads(s),"Thread1-");
        Thread t2 = new Thread(new SequenceUsingThreeThreads(s),"Thread2-");
        Thread t3 = new Thread(new SequenceUsingThreeThreads(s),"Thread3-");


        t1.start();
        t2.start();
        t3.start();
    }
}
