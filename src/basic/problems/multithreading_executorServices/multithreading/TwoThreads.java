package basic.problems.multithreading_executorServices.multithreading;

public class TwoThreads extends Thread {
    //private final String threadName;
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Hello From Thread: %d\n", threadId());
        }
    }
}
