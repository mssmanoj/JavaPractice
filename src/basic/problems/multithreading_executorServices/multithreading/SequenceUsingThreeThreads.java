package basic.problems.multithreading_executorServices.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceUsingThreeThreads implements Runnable {

    SequenceUsingThreeThreadsTest s;

    public SequenceUsingThreeThreads(SequenceUsingThreeThreadsTest s) {
        this.s = s;
    }

    @Override
    public void run() {
        synchronized (this) {
            while (s.getCount() < 11) {
                System.out.println(Thread.currentThread().getName() + " " + s.getCount());
                s.setCount(s.getCount() + 1);
            }
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            notifyAll();
        }
    }
}
