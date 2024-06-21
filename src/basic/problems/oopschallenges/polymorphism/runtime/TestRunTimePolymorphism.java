package basic.problems.oopschallenges.polymorphism.runtime;

public class TestRunTimePolymorphism {
    public static void main(String[] args) {
        //calling with vehicle ref with vehicle obj
        Vehicle vehicle = new Vehicle();
        vehicle.service();

        //calling with vehicle reference and car object -->
        // it doesn't matter what's the reference at run time it checks for object
        Vehicle veh = new Car();
        veh.service();

        //calling with car ref car obj
        Car car = new Car();
        car.service();
    }
}
