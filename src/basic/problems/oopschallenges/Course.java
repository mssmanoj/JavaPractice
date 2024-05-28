package basic.problems.oopschallenges;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Course {
    String courseName;
    static int maxCapacity=60;
    int numberOfEnrollments;
    String[] enrolledStudents=new String[maxCapacity];

    Course(){
    courseName="CSE";
    numberOfEnrollments=0;
    }

    public void enrollStudent(String name){
        enrolledStudents[numberOfEnrollments]=name;
        numberOfEnrollments++;
        System.out.println("Students after enrolling new student:"+Arrays.toString(enrolledStudents));
    }
    public void unenrollStudent(String name){
        int i=0;
        int j=0;
        String newEnrolledStudents[]=new String[maxCapacity];
        while (i<numberOfEnrollments){
            if (!enrolledStudents[i].equalsIgnoreCase(name)){
                newEnrolledStudents[j]=enrolledStudents[i];
                j++;
            }
            i++;
        }
        System.out.println("Students after unErolling student:"+Arrays.toString(newEnrolledStudents));
    }

    public static void setMaxLimit(int capacity){
        maxCapacity =capacity;
    }
}
