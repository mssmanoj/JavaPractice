package basic.problems.functional_programming.streams;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5,3,4,2,1,7,6,8,9));

        numbers.stream()
                .filter(i->i%2==1)
                .forEach(i->System.out.printf(String.valueOf(i)+" "));
    }
}
