package basic.problems.functional_programming.functional_interface;

import javax.script.ScriptContext;
import java.util.Scanner;

public class PrimeNumberClass {
    public static void main(String[] args) {
        PrimeFunctional primeChecker = a -> {
            if (a == 1) {
                return true;
            }

            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println("PrimeChecker for " + number + " is: " +primeChecker.check(number));
    }
}
