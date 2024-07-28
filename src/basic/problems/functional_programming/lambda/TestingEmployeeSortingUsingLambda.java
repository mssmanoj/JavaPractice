package basic.problems.functional_programming.lambda;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestingEmployeeSortingUsingLambda {
    public static void main(String[] args) {
        List<EmployeeSortingUsingLambda> employees = List.of(new EmployeeSortingUsingLambda("Manoj",1, LocalDate.of(1999,10,10),917242)
                ,new EmployeeSortingUsingLambda("Aditya",2, LocalDate.of(2002,12,31),842122)
                ,new EmployeeSortingUsingLambda("Nisha",3, LocalDate.of(2001,06,04),880614)
                ,new EmployeeSortingUsingLambda("Prajwal",4, LocalDate.of(2009,10,24),703057));

        employees.stream()
                .sorted((emp1,emp2)->
                        Integer.compare(emp2.getDob().getYear(),emp1.getDob().getYear()))
                .forEach(System.out::println);

    }
}
