package basic.problems.oopschallenges.polymorphism.runtime;

public class Car extends Vehicle{
    void service(){
        super.service();
        System.out.println("Car Service");
    }
}
