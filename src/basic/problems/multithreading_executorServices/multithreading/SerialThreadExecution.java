package basic.problems.multithreading_executorServices.multithreading;

public class SerialThreadExecution extends Thread implements Runnable{
    private final char symbol;
    public SerialThreadExecution(char symbol){
        this.symbol =  symbol;
    }

    public void run(){
        long startTime = System.currentTimeMillis();
        System.out.println("Thread Name-"+this.getName());
        System.out.println(symbol + "Start Time-"+System.currentTimeMillis());
        for (int i=1;i<=10;i++)
        {
            System.out.println(symbol+" "+i);
        }
        System.out.println("Execution Time-"+ (System.currentTimeMillis() - startTime)+"\n");
    }
}
