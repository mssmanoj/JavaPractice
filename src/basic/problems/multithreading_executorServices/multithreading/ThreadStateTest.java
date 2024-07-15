package basic.problems.multithreading_executorServices.multithreading;

public class ThreadStateTest {
    public static void main(String[] args) throws InterruptedException{
        ThreadStateProgram t1 = new ThreadStateProgram();

        System.out.println("new "+t1.getState());//new

        t1.start();
        System.out.println("after start "+t1.getState()); //runnable

        t1.join();
        System.out.println("after join "+t1.getState());//terminated

    }
}
