package basic.problems.functional_programming.lambda;

public class MultiplicationOfTwoNumbers {
    public static void main(String[] args) {
        MultiInterface multiply = (a, b)-> a*b;

        System.out.println(multiply.perform(4,6));
    }

}