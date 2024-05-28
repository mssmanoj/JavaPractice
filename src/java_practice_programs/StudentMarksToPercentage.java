package java_practice_programs;

import java.util.Scanner;

public class StudentMarksToPercentage {
    public static void main(String[] args) {
        int sub1,sub2,sub3,sub4,sub5,total;
        float percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sub1 marks:\n");
        sub1 = sc.nextInt();
        System.out.println("Enter sub2 marks:\n");
        sub2 = sc.nextInt();
        System.out.println("Enter sub3 marks:\n");
        sub3 = sc.nextInt();
        System.out.println("Enter sub4 marks:\n");
        sub4 = sc.nextInt();
        System.out.println("Enter sub5 marks:\n");
        sub5 = sc.nextInt();
        percentage = (float) (sub1 + sub2 + sub3 + sub4 + sub5) /5;
        if (percentage>35){
            System.out.println("Congratulations!!\n Result-->Passed\n Percentage:"+percentage);
        }else {
            System.out.println("Better luck next time\n Result-->Failed\n Percentae:"+percentage);
        }

    }
}
