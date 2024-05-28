package basic.problems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //isPrimeNumber(number);
        isPrime(2);
    }

    public static void isPrimeNumber(int num) {
        if (num == 1) {
            System.out.println("NOT Prime Number");
            return;
        }
        if (num == 2) {
            System.out.println("Prime Number");
            return;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }

    //fails in case user entered number 2
    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return true;
            }
            i++;
        }
        return false;
    }

}
