package basic.problems.collection_framework.collection;

import basic.problems.collection_framework.collection.comparator.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        //created anonymous inner class for comparator
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(5, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.grade - o2.grade;
            }
        });

        //need outerclass instance to access inner class
        StudentPriorityQueue sp = new StudentPriorityQueue();
        StudentPriorityQueue.Student student = sp.new Student('C', "Manoj");
        priorityQueue.add(sp.new Student('C', "Manoj"));
        priorityQueue.add(sp.new Student('B', "Aditya"));
        priorityQueue.add(sp.new Student('A', "Nisha"));
        priorityQueue.add(sp.new Student('D', "Nisha"));
        priorityQueue.add(sp.new Student('E', "Nisha"));

        System.out.println(priorityQueue); //current state of the queue wont be print sorted it will remove in sort order
    }


    //student properties
    class Student {
        Character grade;
        String name;

        public Student(Character grade, String name) {
            this.grade = grade;
            this.name = name;
        }

        @Override
        public String toString() {
            return "StudentPriorityQueue{" +
                    "grade='" + grade + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
