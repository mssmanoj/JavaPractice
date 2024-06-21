package basic.problems.strings;

import basic.problems.array.ArrayUtil;

import java.util.Scanner;

public class ConcatArrayOfStringUsingStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String Arrays Size");
        int size =  scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[size];
        System.out.println("Enter String Array Elements:");
        for(int i = 0; i < size; i++){
            strings[i] = scanner.nextLine();
        }
        StringBuilder stringBuilder =  new StringBuilder("");
        System.out.println("Appending String array to StringBuilder...");
        for(int i = 0; i < size; i++){
            stringBuilder.append(strings[i]);
            stringBuilder.append(" ");
        }

        System.out.println(stringBuilder);
    }
}
