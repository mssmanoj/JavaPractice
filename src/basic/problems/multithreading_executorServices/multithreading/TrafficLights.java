package basic.problems.multithreading_executorServices.multithreading;

public enum TrafficLights {
    RED(8000),
    GREEN(5000),
    YELLOW(1000);

    private final int onTimeMilis;

    TrafficLights(int onTimeMilis) {
        this.onTimeMilis = onTimeMilis;
    }

    public int getTimeMillis(){
        return onTimeMilis;
    }
}
