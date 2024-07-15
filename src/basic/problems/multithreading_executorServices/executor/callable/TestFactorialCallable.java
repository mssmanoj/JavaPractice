package basic.problems.multithreading_executorServices.executor.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestFactorialCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FactorialCallable task1 = new FactorialCallable(5);
        FactorialCallable task2 = new FactorialCallable(10);
        FactorialCallable task3 = new FactorialCallable(15);

        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<Integer> fact1 = service.submit(task1);
        Future<Integer> fact2 = service.submit(task2);
        Future<Integer> fact3 = service.submit(task3);

        System.out.println("Fact1:"+fact1.get());
        System.out.println("Fact2:"+fact2.get());
        System.out.println("Fact3:"+fact3.get());

        service.shutdown();
    }
}
