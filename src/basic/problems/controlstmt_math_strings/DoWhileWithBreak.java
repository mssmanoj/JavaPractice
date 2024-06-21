package basic.problems.controlstmt_math_strings;

import java.util.Scanner;

public class DoWhileWithBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter Name for DB entry:");
            String tempString = sc.nextLine();
            if (tempString.equals("Exit")){
                System.out.println("Exited the program...");
                break;
            }
            strings[i] = tempString;
        }
    }
}
