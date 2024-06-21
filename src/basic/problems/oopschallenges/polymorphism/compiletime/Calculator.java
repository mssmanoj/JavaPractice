package basic.problems.oopschallenges.polymorphism.compiletime;

import com.sun.source.tree.BreakTree;

public class Calculator {
    protected int add(int a, int b){
        return a+b;
    }

    protected int add(int a, int b, int c){
        return a+b+c;
    }

    protected double add(double a,double b, double c,double d){
        return a+b+c+d;
    }
}
