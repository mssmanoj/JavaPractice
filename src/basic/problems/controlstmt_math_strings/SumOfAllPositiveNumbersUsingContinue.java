package basic.problems.controlstmt_math_strings;

import java.util.Scanner;

public class SumOfAllPositiveNumbersUsingContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        while (true) {
            System.out.println("Enter new number OR 000 to exit");
            int tempNum = scanner.nextInt();
            if (tempNum == 000){
                System.out.println("Exited input section Displaying sum.....");
                break;
            }
            if (tempNum<0){
                continue;
            }
            sum+=tempNum;
        }
        System.out.println("Sum of all positive numbers:"+sum);
    }
}
