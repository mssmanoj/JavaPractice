package basic.problems.multithreading_executorServices.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultipleThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        RunnableTasks task1= new RunnableTasks('@');
        RunnableTasks task2= new RunnableTasks('#');
        RunnableTasks task3= new RunnableTasks('$');

        //ExecutorService service = Executors.newSingleThreadExecutor();
       ExecutorService service = Executors.newFixedThreadPool(3);

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        //awaitTermination returns true if executor is terminated in time else false
        if (!service.awaitTermination(10, TimeUnit.SECONDS)){
            service.shutdownNow();
        }
        service.shutdown();
    }

}
