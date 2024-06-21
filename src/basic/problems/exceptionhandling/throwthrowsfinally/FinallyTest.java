package basic.problems.exceptionhandling.throwthrowsfinally;

import java.util.Scanner;

//finally is the block which is used with try catch
public class FinallyTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first = scanner.nextInt();
        System.out.println("Enter Second Number");
        int second = scanner.nextInt();

        try{
            int div = first/second;
            System.out.println("Divison:"+div);
        }catch (ArithmeticException e){
            throw e;
        }finally {
            System.out.println("Cleaning Resources before Exit....");
        }
    }
}
