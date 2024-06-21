package basic.problems.oopschallenges.encapsulation.com.example.geometry;

import basic.problems.oopschallenges.encapsulation.com.example.geometryutils.Calculator;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = scanner.nextInt();
        Calculator calculator = new Calculator();
        System.out.println("circumference of circle:");
        System.out.println(calculator.circumferenceOfCircle(radius));
        System.out.println("area of circle:");
        System.out.println(calculator.areaOfCircle(radius));
    }
}
