package basic.problems.oopschallenges.abstraction.using_interfaces.diamond_resolved;

public class ImplementingClass implements FirstInterFace, SecondInterface{

    @Override
    public void displayNumber() {
        FirstInterFace.super.displayNumber();
        SecondInterface.super.displayNumber();
    }
}
