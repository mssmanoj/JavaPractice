package basic.problems;

import java.util.Scanner;

public class LCMProgram {
    //15 20
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int large= num2*num1;
        int i=1;
        while (i<=large){
            //logic to check given numbers are divisible by each other
            if (num1%num2==0){
                System.out.println(1);
                break;
            }else if (num2%num1==0){
                System.out.println(num2);
                break;
            }

            //logic to check iterator is divisible by both numbers?
            if ((i%num1 == 0) && (i%num2 == 0)){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
