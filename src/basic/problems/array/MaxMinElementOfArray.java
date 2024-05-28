package basic.problems.array;

import java.util.Scanner;

public class MaxMinElementOfArray extends ArrayUtil{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size= sc.nextInt();
        int arr[]=getArrayInput(size);
        System.out.println("Minimum element from the array:"+getMinOfArray(arr));
        System.out.println("Maximum elemnt from array:"+getMaxOfArray(arr));
    }

    private static int getMaxOfArray(int[] arr) {
        int i=0;
        int max=arr[0];
        while (i<arr.length){
            if (arr[i]>max){
                max=arr[i];
            }
            i++;
        }
        return max;
    }

    private static int getMinOfArray(int[] arr){
        int i=0;
        int min=arr[0];
        while (i<arr.length){
            if (arr[i]<min){
                min=arr[i];
            }
            i++;
        }
        return min;
    }

}
