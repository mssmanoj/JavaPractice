package basic.problems.array;

import java.util.Scanner;

public class numberOfOccurrencesOfArrayElement extends ArrayUtil{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int size= sc.nextInt();
        int arr[]= getArrayInput(size);
        System.out.println("Enter Number To Find it's Occurrences:");
        int number=sc.nextInt();
        System.out.println(number+" Occurred "+getNumberOfOccurrences(arr,number)+" times in the given array.");
    }

    private static int getNumberOfOccurrences(int[] arr,int number){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (number==arr[i]){
                count++;
            }
        }
        return count;
    }
}
