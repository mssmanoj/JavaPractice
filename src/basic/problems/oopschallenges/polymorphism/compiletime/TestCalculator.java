package basic.problems.oopschallenges.polymorphism.compiletime;

/**
 * we can identify which method is going to call by looking at its list of argument list and return type
 */
public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sumOfTwo = calculator.add(1,2);
        int sumOfThree = calculator.add(1,3,4);
        int sumOfFour = (int) calculator.add(1,2,3,4);
        System.out.println("sumOfTwo:"+sumOfTwo);
        System.out.println("sumOfThree:"+sumOfThree);
        System.out.println("sumOfFour:"+sumOfFour);
    }
}
