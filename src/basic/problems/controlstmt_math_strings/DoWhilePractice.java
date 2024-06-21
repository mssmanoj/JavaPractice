package basic.problems.controlstmt_math_strings;

import java.util.Scanner;

public class DoWhilePractice {
    public static void main(String[] args) {
        String password = "@mssManoj";
        Scanner scanner = new Scanner(System.in);
        String enteredPassword;
        do {
            System.out.print("Hey Manoj Enter Password:");
            enteredPassword = scanner.nextLine();
        } while (!password.equals(enteredPassword));

        System.out.println("Login Successful...");
    }
}
