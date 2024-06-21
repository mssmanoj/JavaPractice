package basic.problems.controlstmt_math_strings;

public class PrintOnlyEvenNumbersUsingContinue {
    public static void main(String[] args) {
        System.out.println("Printing all EVEN numbers till 50..");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
