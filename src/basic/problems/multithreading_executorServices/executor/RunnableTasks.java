package basic.problems.multithreading_executorServices.executor;

public class RunnableTasks implements Runnable{

    private final Character specialChar;

    public RunnableTasks(Character specialChar) {
        this.specialChar = specialChar;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Task Started:"+threadName);
        for (int i=1;i<=1000;i++){
            System.out.printf(specialChar +""+ i + " ");
        }
        System.out.println("Task Completed:"+threadName);
    }
}
