package basic.problems.functional_programming.streams;

import java.util.List;
import java.util.stream.Stream;

/**
 * filter->(predicate)
 * boolean value function to filter the data
 * if its true it will consider the stream element
 * example: number-> number>10 (used lambda)
 * it will filter the number is greater than 10
 * <p>
 * map->(manipulate and return new value)
 */
public class Methods {
    public static void main(String[] args) {

        //filter method
        List<String> names = List.of("Manthan", "Manoj", "Devika", "Aditya", "Nisha", "Sukumar");
        Stream<String> nameStream = names.stream();
        List<String> mNames = nameStream.filter(name->name.startsWith("M")).toList();
        System.out.println(mNames);

        //map method

        List<Integer> numbers = List.of(1,5,3,6,3,8,6,2);
        Stream<Integer> integerStream = numbers.stream();
        List<Integer> squareList = integerStream.map(i->i*i).toList();
        System.out.println(squareList);
    }

}
