package basic.problems.functional_programming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class FilterTheStringsAndConcat {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(List.of("Manoj is SDE", "Manoj can do good Coding", "Bad", "Super", "Manoj have good understanding of java "));

        Stream<String> stringStream = strings.stream();
        Stream<String> filteredStrings = stringStream.filter(string -> string.length()>=10);

        String finalString = filteredStrings.reduce("",(a , b)->a+"\n "+b); //used BinaryOperator Functional interface
        System.out.println(finalString);
    }
}
