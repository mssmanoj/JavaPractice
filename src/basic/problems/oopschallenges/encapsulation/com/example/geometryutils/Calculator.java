package basic.problems.oopschallenges.encapsulation.com.example.geometryutils;

public class Calculator {
    private double pi = 3.1412;

    public double circumferenceOfCircle(double radius) {
        return 2 * pi * radius;
    }

    public double areaOfCircle(double radius) {
        return pi * Math.pow(radius,2);
    }

    public double areaOfRectangle(double width, double length) {
        return width * length;
    }
}
