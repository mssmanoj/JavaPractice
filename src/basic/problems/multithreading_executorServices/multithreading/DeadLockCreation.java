package basic.problems.multithreading_executorServices.multithreading;

public class DeadLockCreation {
    final String lock1 = "first";
    final String lock2 = "second";

    //used anonymous inner class
    Thread t1 = new Thread(){
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("Its T1");
                synchronized (lock2){
                    System.out.println("Executed");
                }
            }
        }
    };

    //used anonymous inner class
    Thread t2 = new Thread(){
        @Override
        public void run() {
            synchronized (lock2){
                System.out.println("Its T2");
                synchronized (lock1){
                    System.out.println("Executed");
                }
            }
        }
    };



    public static void main(String[] args) {
        DeadLockCreation d = new DeadLockCreation();
        d.t1.start();
        d.t2.start();
    }
}
