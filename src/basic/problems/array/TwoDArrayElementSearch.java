package basic.problems.array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayElementSearch extends ArrayUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter columns");
        int columns = scanner.nextInt();
        //getinputs for 2DArray
        int[][] twoDArray = get2DArrayInput(rows, columns);
        System.out.println("Entered Array:");
        //printing 2DArray
        print2DArray(rows, columns, twoDArray);

        int[]  position=new int[2];
        System.out.println("Enter element to search in the array:");
        int element=scanner.nextInt();
        System.out.println("Is element present-"+searchElementInArray(element,twoDArray,rows,columns,position));
        System.out.println("position"+ Arrays.toString(position));

    }



    //searches the given element in 2D Array..
    private static boolean searchElementInArray(int element, int[][] twoDArray, int rows, int columns,int[] position) {
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                if (twoDArray[i][j] == element) {
                    position[0]=i;
                    position[1]=j;
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
