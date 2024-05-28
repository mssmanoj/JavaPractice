package basic.problems;

import java.util.Scanner;

public class FactorialProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact=1;
        int i=1;
        while (i<=number){ //5
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial of given number:"+fact);
    }
}
