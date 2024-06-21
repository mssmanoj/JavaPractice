package basic.problems.exceptionhandling.trycatch;

import java.util.Scanner;

public class TryCatchExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first = scanner.nextInt();
        System.out.println("Enter Second Number");
        int second = scanner.nextInt();
        getDivision(first, second);
    }

    private static void getDivision(int first, int second){
        int division = 0;
        try {
            division = first / second;
            System.out.println("Division Successful..");
            System.out.println("Division:"+division);
        }catch (ArithmeticException exception){
            if (exception.getMessage().equals("/ by zero")){
                System.out.println("Please Enter Valid Input Which Can Divide and Divisible: "+"\n"+ exception);
            }else {
                throw exception;
            }
        }
    }
}
