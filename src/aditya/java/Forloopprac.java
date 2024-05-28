package aditya.java;

import java.util.Scanner;

public class Forloopprac {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        int i = 1, calculatedValue=0;
                String temp="";
        while (!(temp.equals("="))){
            System.out.println("Enter Value");
            temp = sc.nextLine();
            if (temp.toString().equals("=")){
                break;
            }
            try {
                calculatedValue+=Integer.parseInt(temp);
            }catch (NumberFormatException numberFormatException){
                System.out.println("Please Enter Valid Input");
            }

            //i=Integer.parseInt(temp);
        }
        System.out.println("Total : "+calculatedValue);





        /*int i = 1, num, fsum;

        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        for (i = 1; i <= num; num++) {
            if (num == +2) {
                System.out.println("Enter your number");

            } else {
                System.out.println(num);
                fsum = +num;
            }
        }*/











/* TABLE
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = input.nextInt();
        int table = number;
        for (int i=0;i<10;i++){
            System.out.print(number+"  ");
            number+=table;
        }*/

        /*int a = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number : ");
        int number = input.nextInt();
        int oddSum = 0;
        for (a = 1; a <= number; a++) {
            if ((a % 2 == 1)) {
                oddSum = oddSum + a;
            }
        }
        System.out.println(oddSum);*/


    }
}
