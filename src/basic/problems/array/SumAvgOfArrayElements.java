package basic.problems.array;

import java.util.Scanner;

public class SumAvgOfArrayElements extends ArrayUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = getArrayInput(size);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Sum of array elements:" + getArraySum(arr));
        System.out.println("Average of elements:" + getArraySum(arr) / arr.length);
    }

    private static int getArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
