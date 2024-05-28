package basic.problems.array;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class SumAndAverageOf2DArrayElements extends ArrayUtil{
    public static void main(String[] args) {
        int rows,columns;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows for array");
        rows=scanner.nextInt();
        System.out.println("Enter number of columns for array");
        columns=scanner.nextInt();
        int[][] array=get2DArrayInput(rows,columns);
        System.out.println("Sum of Array Elements:"+sumOf2DArrayElements(array,rows,columns));
        System.out.println("Average of array elements:"+sumOf2DArrayElements(array,rows,columns)/(rows*columns));
    }

    private static int sumOf2DArrayElements(int[][] array,int rows,int columns){
        int i=0;
        int sum=0;
        while (i<rows){
            int j=0;
            while (j<columns){
                sum+=array[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
