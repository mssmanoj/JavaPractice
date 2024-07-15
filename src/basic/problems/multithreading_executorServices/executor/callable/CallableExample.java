package basic.problems.multithreading_executorServices.executor.callable;

import java.util.concurrent.Callable;

public class CallableExample implements Callable {
    private String firstName;
    private String lastName;

    public CallableExample(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public Object call() throws Exception {
        return firstName + " " + lastName;
    }
}
