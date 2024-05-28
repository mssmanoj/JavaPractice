package basic.problems.array;

import java.util.Scanner;

public class AdditionOfDiagonalElementsOfMatix extends ArrayUtil{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows= scanner.nextInt();
        System.out.println("Enter number of columns");
        int columns=scanner.nextInt();

        int[][] array=get2DArrayInput(rows,columns);
        print2DArray(rows,columns,array);
        getPrimaryDiagonalSum(array,rows,columns);
        //System.out.println("Sum of diagonal elements:"+ getPrimaryDiagonalSum(array,rows,columns));
    }

    public static void getPrimaryDiagonalSum(int[][] array, int rows, int columns){
        int i=0;
        int pSum=0;
        int sSum=0;
        while (i<rows){
            int j=0;
            while (j<columns){
                if (i==j){
                    pSum+=array[i][j]; //left diagonal of array
                }
                if (i+j == array.length-1){
                    sSum+=array[i][j];//right diagonal of array
                }
                j++;
            }
            i++;
        }
        System.out.println("Sum of primary diagonal elements:"+pSum);
        System.out.println("Sum of secondary diagonal elements:"+sSum);

    }

}
