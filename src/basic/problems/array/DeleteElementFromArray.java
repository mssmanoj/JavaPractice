package basic.problems.array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromArray extends ArrayUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = getArrayInput(size);

        System.out.println("Enter Element To Delete:");
        int deleteElement = sc.nextInt();
        int countOfElement = getCountOfElementInArray(deleteElement, arr);
        //System.out.println("Element count:"+countOfElement);

        int[] newArr = new int[arr.length - countOfElement];
        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] != deleteElement) {
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        System.out.println("New Array:" + Arrays.toString(newArr));
    }
}
