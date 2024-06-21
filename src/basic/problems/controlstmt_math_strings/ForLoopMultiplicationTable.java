package basic.problems.controlstmt_math_strings;

import java.util.Scanner;

public class ForLoopMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Number To Print Multiplication Table:");
        int table = scanner.nextInt();
        System.out.println("Multiplication table of "+table);
        for (int i=1;i<11;i++){
            System.out.println(table*i);
        }
    }
}
