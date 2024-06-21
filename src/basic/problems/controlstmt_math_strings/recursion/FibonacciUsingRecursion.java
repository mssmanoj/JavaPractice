package basic.problems.controlstmt_math_strings.recursion;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Printing fibonacci for first 20 numbers");
        System.out.println(recursiveFib(10));
        for(int i=1;i<11;i++){
            System.out.println(recursiveFib(i));
        }
    }

    public static int recursiveFib(int number) {
        if (number==1){
            return 0;
        }
        if (number==2){
            return 1;
        }
        return recursiveFib(number-1)+recursiveFib(number-2);
    }
}
