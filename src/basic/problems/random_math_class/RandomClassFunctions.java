package basic.problems.random_math_class;

import java.util.Random;

/**
 * random()-generates random number
 */
public class RandomClassFunctions {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //Math random generates decimal random number from 0 to 1
            System.out.println(Math.round(Math.random()*100));
        }
    }
}
