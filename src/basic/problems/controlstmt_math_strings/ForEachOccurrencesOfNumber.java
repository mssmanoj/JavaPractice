package basic.problems.controlstmt_math_strings;

import basic.problems.array.ArrayUtil;

import java.util.Scanner;

public class ForEachOccurrencesOfNumber extends ArrayUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int size = scanner.nextInt();
        int[] array = getArrayInput(size);

        System.out.println("Enter number to check occurrences in the array:");
        int inputNumber = scanner.nextInt();
        int occurrence = 0;

        for (int number : array) {
            if (inputNumber == number) {
                occurrence++;
            }
        }

        System.out.println(occurrence > 0 ? "Number of occurrences for number" + inputNumber +
                " in the array is " + occurrence : "Number is not present in the array");
    }
}
