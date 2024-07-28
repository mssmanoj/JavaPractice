package basic.problems.functional_programming.streams;

import java.util.List;
import java.util.stream.Stream;

public class PrintStringUsingStream {
    public static void main(String[] args) {
        List<String> names = List.of("Laxman","Manoj","Aditya","Manthan","Manav");
        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);
    }
}
