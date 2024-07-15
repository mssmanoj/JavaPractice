package basic.problems.collection_framework.collection.comparable;

public class Employee implements Comparable<Employee>{
    protected int id;
    protected String name;
    protected int age;

    public int compareTo(Employee e){
        if (this.name.charAt(0) > e.name.charAt(0)){ //ascending order condition
            return 1; //returning 1 for greater comparison
        }else if(this.name.charAt(0) < e.name.charAt(0)){
            return -1; //if 0th is less then return -1
        }else {
            return 0; //if equals
        }
    }

    protected Employee(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
