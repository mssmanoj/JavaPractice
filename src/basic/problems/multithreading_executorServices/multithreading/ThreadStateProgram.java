package basic.problems.multithreading_executorServices.multithreading;

public class ThreadStateProgram extends Thread{
    public void run(){
        synchronized(this) {
            System.out.println("run " + this.getState());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
