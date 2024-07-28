package basic.problems.functional_programming.lambda;

public class ThreadDemo {
    public static void main(String[] args) {

        //printing table of 2 using runnable functional interface
        //Runnable reference and lambda for method implementation
        Runnable runnable = ()->{
            for (int i=2;i<21;i++){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            System.out.println("thread is running:"+i);
                i++;
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
