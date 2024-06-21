package basic.problems.random_math_class;

import java.util.Random;

public class DiceUsingRandom {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Simulating Dice...");
        int diceNumber = random.nextInt(1, 7);
        System.out.print("Dice number:" + diceNumber);
    }
}
