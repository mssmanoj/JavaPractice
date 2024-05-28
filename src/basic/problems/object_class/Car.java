package basic.problems.object_class;

public class Car {
    String brand;
    String color;
    String fuelType;
    float currentFuel;
    boolean isCarStarted=false;
    static int minimumAgeRequire=18;

    public void addFuel(int currentFuel){
        this.currentFuel += currentFuel;
    }

    public void drive(){
        if (!isCarStarted){
            System.out.println("Please Start the car to drive it.");
            return;
        }
        System.out.println("Car is Driving.....");
        System.out.println("Fuel:"+currentFuel--);;
    }

    public void startCar(Driver driver){
        if (minimumAgeRequire>driver.age){
            System.out.println("Driver is not eligible to drive..");
            return;
        }
        if (currentFuel==0){
            System.out.println("Car cannot star current fuel level:"+currentFuel);
        }else {
            isCarStarted=true;
            System.out.println("Car is Started....");
            //System.out.println("Fuel Level-"+currentFuel);
        }
    }
}
