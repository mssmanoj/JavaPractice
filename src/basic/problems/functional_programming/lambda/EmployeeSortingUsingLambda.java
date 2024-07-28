package basic.problems.functional_programming.lambda;

import java.time.LocalDate;

public class EmployeeSortingUsingLambda {

    private final String name;
    private final int id;
    private int number;
    private final LocalDate dob;

    public EmployeeSortingUsingLambda(String name, int id, LocalDate dob, int number) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "[Name:"+name+",id:"+id+",number:"+number+",dob:"+dob+"]";
    }
}
