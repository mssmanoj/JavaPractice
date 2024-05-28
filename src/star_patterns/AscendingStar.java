package star_patterns;

import java.util.Scanner;

public class AscendingStar {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows to print");
        num = sc.nextInt();
        for(int i=0; i<num; i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
