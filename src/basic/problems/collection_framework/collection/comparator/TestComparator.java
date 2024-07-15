package basic.problems.collection_framework.collection.comparator;

import basic.problems.collection_framework.collection.comparable.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestComparator {
    public static void main(String[] args) {
       Student student = new Student(4,"Manoj","10th",9172);
       Student student1 = new Student(1,"Aditya","9th",8421);
       Student student2 = new Student(5,"Nisha","8th",8806);
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(student,student1,student2));
        System.out.println(students);
        Collections.sort(students, new FirstCondition());
        System.out.println(students);
    }
}
