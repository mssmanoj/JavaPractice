package basic.problems.random_math_class;

import java.util.Scanner;

public class AreaAndCircumferenceOfCircleUsingMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.println("Circumference:"+2*Math.PI*radius);
        System.out.println("Area of circle of circle:"+Math.PI*Math.pow(radius,2));
    }
}
