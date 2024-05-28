package basic.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SumOfDigitsOfInteger {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number;
        try {
            number = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int sum=0;
        while(number>0){
            sum+=number%10; //mod 10 will return last digit of number
            number/=10; // dividing number by 10 will remove last digit from number
        }
        System.out.println(sum);
    }
}
