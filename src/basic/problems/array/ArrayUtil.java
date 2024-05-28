package basic.problems.array;

import java.util.Scanner;

public class ArrayUtil {
    public static int[] getArrayInput(int size){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter your array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int getCountOfElementInArray(int element, int[] arr){
        int i=0;
        int count=0;
        while (i<arr.length){
            if (arr[i]==element){
                count++;
            }
            i++;
        }
        return count;
    }

    public static int[][] get2DArrayInput(int rows,int columns){
        int i=0;
        Scanner scanner=new Scanner(System.in);
        int[][] array=new int[rows][columns];
        System.out.println("Enter array elements:");
        while(i<rows){
            int j=0;
            while (j<columns){
                array[i][j]=scanner.nextInt();
                j++;
            }
            i++;
        }
        return array;
    }

    public static void print2DArray(int rows, int columns, int[][] twoDArray) {
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                System.out.print(twoDArray[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
