package basic.problems.functional_programming.optional;

import java.util.Optional;

public class StringOptionalExample {
    public static void main(String[] args) {
        String name = "Manoj";
        Optional<String> str = getOptional(name);
        str.ifPresent(System.out::println);

    }

    static Optional<String> getOptional(String string){
        if (string == null || string.isEmpty()) {
            return Optional.empty();
        }
       return Optional.of(string.toUpperCase());
    }
}
