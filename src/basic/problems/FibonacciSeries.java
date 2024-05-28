package basic.problems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int i=2;
        int first=0;
        int second=1;
        System.out.println(first);
        System.out.println(second);
        int next;
        while (i<number){
            next=first+second;
            first=second;
            second=next;
            System.out.println(next);
            i++;
        }
    }
}
