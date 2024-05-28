package basic.problems.constructor;

public class ConstructorChaining {
    String brand;
    String color;
    int noOfWheels;
    int fuelTankCapacity;

    //it calls only once for everytime you run the program
    static {
        System.out.println("Its static block");
    }
    //calls everytime when object is created
     { //its also called default constructor because we can initialize variables here
        System.out.println("Its initialization block");
    }
    ConstructorChaining() {
        brand="mahindra";
        color="black";
        noOfWheels=4;
        fuelTankCapacity=30;
    }

    ConstructorChaining(String color){
        this();
        this.color=color;
    }
}
