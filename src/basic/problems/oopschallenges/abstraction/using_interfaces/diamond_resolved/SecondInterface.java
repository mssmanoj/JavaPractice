package basic.problems.oopschallenges.abstraction.using_interfaces.diamond_resolved;

public interface SecondInterface {
    int number = 10;
    default void displayNumber(){
        System.out.println(number);
    }
}
