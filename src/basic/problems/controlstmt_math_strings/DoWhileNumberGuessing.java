package basic.problems.controlstmt_math_strings;

import java.util.Random;
import java.util.Scanner;

public class DoWhileNumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(5);
        int guessedNumber;
        int chances = 3;
        do {
            System.out.println("Guess the number between 0 to 5");
            guessedNumber = scanner.nextInt();
            if (number == guessedNumber) {
                System.out.println("Random Number:" + number);
                System.out.println("Guessed Number:" + guessedNumber);
                System.out.println("You WON!!");
                break;
            }
            if (chances == 1) {
                System.out.println("You Lost The Game..Random number was:" + number);
            }
            chances--;
            System.out.println("You have " + chances + " chances left");
        } while (chances > 0);
    }
}
