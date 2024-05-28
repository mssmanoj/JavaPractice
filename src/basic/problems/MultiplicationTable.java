package basic.problems;

import javax.script.ScriptContext;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        System.out.println("*-*-*-*-*-* Multiplication table (1-10) *-*-*-*-*-*");
        int i=1; //initializing variable for loop
        int table=1; // variable for the table number
        while (i<=10){ // looping 1-10
            int number=table; //assignment the table value to number
            int j=1; //initializing new varible j
            while (j<=10){
                System.out.print(" "+number);
                number=number+table; //logic- add table number to previous number to find next number of table
                j++;
            }
            System.out.println();
            table++; //jump to next table count
            i++; // increment loop
        }





       /* int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print the table");
        int number=sc.nextInt();
        int table = number;
        while (i<10){
            i++;
            System.out.println(number);
            number=number+table;
        }*/
    }
}
