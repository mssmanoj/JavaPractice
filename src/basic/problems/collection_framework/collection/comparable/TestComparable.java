package basic.problems.collection_framework.collection.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TestComparable {
    public static void main(String[] args) {
        Employee employee = new Employee(2,"Manoj",24);
        Employee employee1 = new Employee(5,"Aditya",22);
        Employee employee2 = new Employee(3,"Nisha",20);
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(employee,employee1,employee2));
        Collections.sort(employees);
        System.out.println(employees);
    }
}
