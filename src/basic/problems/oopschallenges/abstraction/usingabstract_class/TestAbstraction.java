package basic.problems.oopschallenges.abstraction.usingabstract_class;

import java.util.Scanner;

public class TestAbstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color");
        Car car = new Car(scanner.nextLine());
        car.showColor();
        car.displayWheels();
    }
}
