package basic.problems.oopschallenges.abstraction.usingabstract_class;

public abstract class Vehicle {
    protected int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    protected abstract void showColor();

    protected void displayWheels() {
        System.out.println("Vehicle has "+numberOfWheels+" wheels");
    }
}
