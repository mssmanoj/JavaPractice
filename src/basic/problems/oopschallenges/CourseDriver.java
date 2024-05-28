package basic.problems.oopschallenges;

import java.util.Arrays;

public class CourseDriver {
    public static void main(String[] args) {
        Course course=new Course();
        System.out.println(course.courseName);
        System.out.println(Arrays.toString(course.enrolledStudents));
        course.enrollStudent("Manoj");
        course.enrollStudent("Aditya");
        course.enrollStudent("nisha");
        course.enrollStudent("Manav");
        course.enrollStudent("Manthan");
        course.unenrollStudent("Nisha");
    }
}
