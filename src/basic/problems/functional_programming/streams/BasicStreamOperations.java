package basic.problems.functional_programming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStreamOperations {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 8, 3, 4, 1, 1));
        System.out.println("Basic list:"+arrayList);

        List<Integer> filtered = arrayList.stream().
                filter(integer -> integer % 2 == 0).toList().
                stream().filter(i-> i<8).toList();

        System.out.println("filtered list:"+filtered);


        //stream using array
        String[] names = {"Manoj","Aditya","Manthan","Nisha","prajwal"};
        Stream<String> stringStream = Stream.of(names);
        stringStream.sorted(Comparator.reverseOrder()).
                toList().forEach(System.out::println);

        //stream using builder
        Stream<Object> streamBuilder = Stream.builder().build();


    }
}
