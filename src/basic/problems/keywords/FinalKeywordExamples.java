package basic.problems.keywords;

import basic.problems.controlstmt_math_strings.recursion.FibonacciUsingRecursion;

/**
 * values for final variables should be assigned with declaration or in constructor
 * you cannot reassign values to final variable
 * final static variable doesn't belong to any object so you cannot assign value through constructor either..
 * final static variable can be assigned at the time of declaration
 */
public class FinalKeywordExamples {
    final double pi; // = 3.1412;

    FinalKeywordExamples(double pi){
        this.pi =  pi; //can be assigned through constructor only
    }

    public static void main(String[] args) {
        FinalKeywordExamples fk= new FinalKeywordExamples(3.1412);
        System.out.println();
    }
}
