package basic.problems.oopschallenges.inheritance;

public class Bike extends TwoWheeler{
    public static void main(String[] args) {
        Bike bike = new Bike();
        System.out.println("no of wheels"+bike.getNumberOfWheels());
        bike.setNumberOfWheels(4);
        System.out.println("no of wheels"+bike.getNumberOfWheels());
    }
}