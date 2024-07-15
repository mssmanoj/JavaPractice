package basic.problems.multithreading_executorServices.multithreading;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficSignal red = new TrafficSignal(TrafficLights.RED);
        TrafficSignal green = new TrafficSignal(TrafficLights.GREEN);
        TrafficSignal yellow = new TrafficSignal(TrafficLights.YELLOW);

        green.start();
        green.join();

        yellow.start();
        yellow.join();

        red.start();
    }
}
