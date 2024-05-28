package operators_and_expressions;

/**
 *  - operator converts the positive number to negative number and vise versa
 *  pre increment increases the value by 1 and then use it in the statement
 *  pre decrement decreases the value by 1 and then use in the statement
 *  post increment use current value in the statement and increase it by 1
 *  post decrement use current value in th statement and decrease it by 1
 */
public class UnaryOperator {
    public static void main(String[] args) {
        // - operator
        int a=5;
        System.out.println(-a);
        //pre increment
        System.out.println(++a);
        //pre decrement
        System.out.println(--a);

        //pre increament
        System.out.println(a++);
        //post decrement
        System.out.println(a--);
    }
}
