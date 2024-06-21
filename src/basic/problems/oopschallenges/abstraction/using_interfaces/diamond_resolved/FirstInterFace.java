package basic.problems.oopschallenges.abstraction.using_interfaces.diamond_resolved;

public interface FirstInterFace {
    int number = 5;

    default void displayNumber(){
        System.out.println(number);
    }
}
