package basic.problems.multithreading_executorServices.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunPrintTask {
    public static void main(String[] args) {
        PrintTask task = new PrintTask();
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(task);
        service.shutdown();
    }
}
