package basic.problems;

import java.util.Scanner;

public class GcdProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int i=Math.min(num1,num2);
        while (i>0){
            if (num1%i ==0 && num2%i==0){
                System.out.println(i);
                break;
            }
            i--;
        }
    }
}
