package basic.problems.multithreading_executorServices.executor.callable;

import java.util.concurrent.Callable;

public class FactorialCallable implements Callable<Integer> {

    private Integer number;

    public FactorialCallable(Integer number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
