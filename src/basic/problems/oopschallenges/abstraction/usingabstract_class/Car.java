package basic.problems.oopschallenges.abstraction.usingabstract_class;

import java.util.Scanner;

public class Car extends Vehicle{
    private static final int numberOfWheels = 4;
    private String color;

    public Car(String color){
        super(numberOfWheels);
        this.color = color;
    }

    protected void showColor(){
        System.out.println("Color:"+color);
    }
}
