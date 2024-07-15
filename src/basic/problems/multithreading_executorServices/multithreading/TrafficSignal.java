package basic.problems.multithreading_executorServices.multithreading;

public class TrafficSignal extends Thread{
    private final TrafficLights light;

    public TrafficSignal(TrafficLights light) {
        this.light = light;
    }

    @Override
    public void run() {
        System.out.println(light + " Started");
        try {
            sleep(light.getTimeMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(light + "Ended\n");
    }
}
