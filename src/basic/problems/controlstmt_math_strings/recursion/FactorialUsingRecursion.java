package basic.problems.controlstmt_math_strings.recursion;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(recursiveFact(10));
    }
    //fact-5 = 5*4*3*2*1
    public static int recursiveFact(int num){
        if (num>0){
            return num*recursiveFact(num-1);
        }
        return 1;
    }
}
