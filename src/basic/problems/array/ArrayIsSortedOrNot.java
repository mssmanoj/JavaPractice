package basic.problems.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsSortedOrNot extends ArrayUtil{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]=getArrayInput(size);
        System.out.print("Given Array:");//20, 23, 23, 45, 78, 88
        System.out.println(Arrays.toString(arr));
        if (isGivenArrayAscSorted(arr) || isGivenArrayDescSorted(arr)){
            System.out.println("Given Array is sorted");
        }else {
            System.out.println("Given Array is Not sorted");
        }
    }

    private static boolean isGivenArrayAscSorted(int[] arr){
        if (arr.length==0 || arr.length==1){
            return true;
        }
        int i=1;
        while (i<arr.length){
            if (arr[i]<arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    private static boolean isGivenArrayDescSorted(int[] arr){
        if (arr.length==0 || arr.length==1){
            return true;
        }
        int i=1;
        while (i<arr.length){
            if (arr[i]>arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
