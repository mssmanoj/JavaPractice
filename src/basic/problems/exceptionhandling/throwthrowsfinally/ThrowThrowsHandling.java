package basic.problems.exceptionhandling.throwthrowsfinally;

import java.util.Scanner;

//throws is just keyword which is used to show that this method can throw the exception
//throw is keyword which actually used to throw the exception
public class ThrowThrowsHandling {
    public static void main(String[] args) throws ArithmeticException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first = scanner.nextInt();
        System.out.println("Enter Second Number");
        int second = scanner.nextInt();
        try {
            getDivision(first, second);
        }catch (Exception e){
            System.out.println("Please Enter Valid Numbers"+"\n"+e);
        }
    }

    private static void getDivision(int first, int second){
        int division = 0;
        try {
            division = first / second;
            System.out.println("Division Successful..");
            System.out.println("Division:"+division);
        }catch (ArithmeticException exception){
           throw exception;
        }
    }
}
