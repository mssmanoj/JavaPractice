package basic.problems.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheArray extends ArrayUtil{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr=getArrayInput(size);
        System.out.println("Reversed Array:"+ Arrays.toString(reverseArray(arr)));
    }

    //using same array
    private static int[] reverseArray(int[] arr){
        int i=0;
        int temp=0;
        while (i<arr.length/2){
            temp=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=temp;
            i++;
        }
        return arr;
    }
}
