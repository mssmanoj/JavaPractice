package basic.problems.functional_programming.functional_interface;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter You Number");
        int number = scanner.nextInt();
        int fact = 1;

        //using simple for loop
        for (int i=number;i>=1;i--){
            fact*=i;
        }
        //System.out.printf("Factorial for "+number+" : "+fact);


        //using functional interface as anonymous class
        FactFunctional factorial = a -> {
            for (int i=a-1;i>=1;i--){
                a=a*i;
            }
            return a;
        };
        System.out.println(factorial.get(number));


        //using stream api
        IntStream.rangeClosed(2,number)
                .reduce((x,y)->x*y)
                .ifPresent(System.out::println);
    }
}
