package basic.problems.controlstmt_math_strings;

import java.util.Scanner;

public class TernaryOperatorPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();;
        int b=sc.nextInt();

        //expression1 ? outputExpression1 : outputExpression2
        //if expression1 is true then output1 will show
        //if expression1 is false then output2 will show
        System.out.println(a>b?a:b);
    }
}
