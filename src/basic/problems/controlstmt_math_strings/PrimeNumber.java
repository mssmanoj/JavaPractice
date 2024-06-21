package basic.problems.controlstmt_math_strings;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check prime number or not");
        int number = scanner.nextInt();
        PrimeNumber pm = new PrimeNumber();
        System.out.println(pm.primeOrNot(number) ? "Prime Number" : "Not Prime");
    }

    private boolean primeOrNot(int number){
        if (number==1){
            return false;
        }
        for (int i=2;i<=number/2;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
