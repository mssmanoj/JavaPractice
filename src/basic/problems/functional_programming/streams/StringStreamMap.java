package basic.problems.functional_programming.streams;

import java.util.List;

public class StringStreamMap {
    public static void main(String[] args) {
        List<String> strings = List.of("1","2","3","4","5");
       // strings.stream().map(Integer::valueOf).forEach(System.out::println);
        strings.stream().map(i->Integer.parseInt(i)*Integer.parseInt(i)).reduce((a,b)->a+b).ifPresent(System.out::println);
    }
}
