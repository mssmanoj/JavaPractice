package basic.problems.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsPalindromeOrNot extends ArrayUtil{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr=getArrayInput(size);
        System.out.println("Given Array:"+ Arrays.toString(arr));
        System.out.println("Palindrome Array is "+isArrayPalindrome(arr));
    }
    private static boolean isArrayPalindrome(int[] arr){
        int i=0;
        while (i<arr.length/2){
            if (arr[i]!=arr[(arr.length-1)-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
