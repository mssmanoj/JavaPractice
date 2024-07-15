package basic.problems.multithreading_executorServices.executor.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableExample task1 = new CallableExample("Manoj","Sakat");
        CallableExample task2 = new CallableExample("Aditya","Sakat");
        CallableExample task3 = new CallableExample("Nisha","Sakat");

        ExecutorService service = Executors.newFixedThreadPool(2);

        // using Future returning to get returned value of callable
        Future<String> fullname1 = service.submit(task1);
        Future<String> fullname2 = service.submit(task2);
        Future<String> fullname3 = service.submit(task3);


        System.out.println("First Candidate:"+fullname1.get());
        System.out.println("Second Candidate:"+fullname2.get());
        System.out.println("Third Candidate:"+fullname3.get());

        service.shutdown();
    }
}
