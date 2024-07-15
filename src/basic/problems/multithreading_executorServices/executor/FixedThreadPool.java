package basic.problems.multithreading_executorServices.executor;

import java.util.Random;

public class FixedThreadPool implements Runnable{
    @Override
    public void run() {
        Random random = new Random();
        int timeInMilliSec = random.nextInt(5000,10000);
        try {
            Thread.sleep(timeInMilliSec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " Time Slept:" + timeInMilliSec);
    }
}
