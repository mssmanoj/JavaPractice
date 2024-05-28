package basic.problems;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1; //initializing variable
        int sum=0;// variable for storing sum of all odd numbers
        int num= sc.nextInt(); //user input
        while(i<=num){
            if ((i&1)==1){ //using bitwise & operator to find number is even or odd
                sum+=i; //i holding value of number and adding to sum
            }
            i++; //incrementing i to check next number
        }
        System.out.println(sum); //printing sum
    }
}
