package basic.problems.controlstmt_math_strings.recursion;

import java.util.Scanner;

public class StringPelindromeUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = scanner.next();
        System.out.println(isPalindrome(str)?"String is Palindrome":"String is not Palindrome");

    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        //checking for first letter and last letter of the string not equal
        int lastPosition = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPosition)) {
            return false;
        }

        return isPalindrome(str.substring(1, lastPosition));
    }
}
