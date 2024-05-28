package basic.problems;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) { //123
            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
        }
        System.out.println(reversedNumber);
        if (originalNumber == reversedNumber) {
            System.out.println("Given Number is Pelindrome");
        } else {
            System.out.println("Given Number is Not Pelindrome");
        }
    }
}
