package basic.problems.controlstmt_math_strings;

import basic.problems.array.ArrayUtil;

import java.sql.Array;
import java.util.Scanner;

public class ForEachMinFromArray extends ArrayUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int[] myArray = getArrayInput(size);
        int minimum=myArray[0];
        for(int num:myArray){
            if (num<minimum){
                minimum=num;
            }
        }
        System.out.println("Minimum number from array:"+minimum);
    }
}
