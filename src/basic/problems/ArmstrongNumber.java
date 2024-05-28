package basic.problems;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt(); //153
        isArmstrongNumber(number,splitNumberAndGetCube(number));
    }
    public static void isArmstrongNumber(int number1,int number2){
        if (number1==number2){
            System.out.println("Given Number:"+number1);
            System.out.println("Addition of each digit cube is:"+number2);
            System.out.println("Hence this is ArmstrongNumber");
        }else {
            System.out.println("Given Number:"+number1);
            System.out.println("Addition of each digit cube is:"+number2);
            System.out.println("Hence this is Not ArmstrongNumber");
        }
    }
    public static int splitNumberAndGetCube(int number){
        int tempNo = number;
        int finalNumber = 0;
        while (tempNo>0){
            finalNumber+=getCube(tempNo%10);
            tempNo/=10;
        }
        return finalNumber;
    }

    public static int getCube(int number){
        int cube=number;
        int i=0;
        while (i<2){
            cube=cube*number;
            i++;
        }
        return cube;
    }
}
