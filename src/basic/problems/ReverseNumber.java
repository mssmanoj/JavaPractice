package basic.problems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int reversedNumber = 0;
        int temp;
        while (number>0){ //236
            temp=number%10;
            reversedNumber*=10;
            reversedNumber+=temp;
            number/=10;
        }
        System.out.println(reversedNumber);
    }
}
