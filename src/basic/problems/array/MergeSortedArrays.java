package basic.problems.array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays extends ArrayUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First array size:");
        int size1 = sc.nextInt();
        int[] arr1 = getArrayInput(size1);

        System.out.println("Second array size:");
        int size2 = sc.nextInt();
        int[] arr2 = getArrayInput(size2);
        int[] newArr = new int[arr2.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                newArr[k++] = arr2[j++];
            } else {
                newArr[k++] = arr1[i++];
            }
        }

        while (i < arr1.length) {
            newArr[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            newArr[k++] = arr2[j++];
        }
        Arrays.sort(newArr);
        System.out.println("MERGED ARRAY: " + Arrays.toString(newArr));
    }
}
