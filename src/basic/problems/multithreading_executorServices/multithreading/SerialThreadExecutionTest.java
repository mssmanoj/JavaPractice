package basic.problems.multithreading_executorServices.multithreading;

public class SerialThreadExecutionTest {
    public static void main(String[] args) throws InterruptedException {
        SerialThreadExecution t1 = new SerialThreadExecution('@');
        SerialThreadExecution t2 = new SerialThreadExecution('#');
        SerialThreadExecution t3 = new SerialThreadExecution('$');


        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);


        thread1.start();

        thread1.join();
        thread2.start();

        thread2.join();
        thread3.start();
    }
}
