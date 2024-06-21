package basic.problems.strings;

/**
 * toString()- used to display the object of the class
 * bydefault toString display class name followed by unique object hashcode
 * example - Car car= new Car();
 * car.toString();
 * result- Car@0623040--> hashcode
 */
public class ToStringMethodExample {
    public ToStringMethodExample(String name, int numberOfWheels, String color, int numberOfSeats) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
    }

    String name;
    int numberOfWheels;
    String color;
    int numberOfSeats;

    @Override
    public String toString() {
        return super.toString();
        /*"ToStringMethodExample{" +
                "name='" + name + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", color='" + color + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                '}';*/
    }

    public static void main(String[] args) {
        ToStringMethodExample ts = new ToStringMethodExample("Tata", 4, "Black", 5);
        System.out.println(ts.toString()); //displaying the object
    }
}
