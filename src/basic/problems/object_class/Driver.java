package basic.problems.object_class;

public class Driver {
    String name;
    int age;
    float experience;

    public static void main(String[] args) {
        /*Car car=new Car();
        car.addFuel(5);
        car.startCar();
       car.drive();
       car.drive();*/
        Car swift=new Car();
        Driver d=new Driver();
        d.age=15;
        swift.addFuel(5);
        swift.startCar(d);
        swift.drive();
    }
}
