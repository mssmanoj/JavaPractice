package basic.problems.functional_programming.lambda;

public class CalcInterfaceUsingAnonymousClass {
    public static void main(String[] args) {
        //int a = 5, b = 15;

        /*CalcInterface calculator = new CalcInterface() {
            @Override
            public int calculate(int number1, int number2) {
                return a+b;
            }
        };
        System.out.println(calculator.calculate(a,b));
*/

        //adding two numbers
       CalcInterface calcSum = (a,b)-> a+b;
        System.out.println(calcSum.calculate(50,20));

        //finding string length

        StringLength stringLength = (string) -> string.length();
        System.out.println("String length:"+stringLength.findLength("Manoj"));
    }
}
