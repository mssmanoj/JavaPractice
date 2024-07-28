package basic.problems.functional_programming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class removeDuplicatesUsingStream {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,6,4,3,2,1};
        Arrays.stream(arr).distinct().sorted().forEach(System.out::print);
    }
}
