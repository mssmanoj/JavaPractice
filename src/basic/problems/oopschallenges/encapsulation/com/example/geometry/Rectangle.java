package basic.problems.oopschallenges.encapsulation.com.example.geometry;

import basic.problems.oopschallenges.encapsulation.com.example.geometryutils.Calculator;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter width");
        double width = scanner.nextDouble();
        System.out.println("Enter length:");
        double length = scanner.nextDouble();
        System.out.println("Area of rectangle:");
        System.out.println(calculator.areaOfRectangle(width,length));
    }
}
