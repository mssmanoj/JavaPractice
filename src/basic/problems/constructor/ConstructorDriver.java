package basic.problems.constructor;

public class ConstructorDriver {
    public static void main(String[] args) {
       /* DefaultConstructor dc=new DefaultConstructor();
        System.out.println("Default values of the constructor:");
        System.out.println(dc.name);
        System.out.println(dc.age);
        System.out.println(dc.college);*/

       /* System.out.println("Lets See Parameterized values:");
        //passing values while object creation
        ParameterizedConstructor pc=new ParameterizedConstructor("Aditya",21,"SM.JOSHI");
        System.out.println(pc.name);
        System.out.println(pc.age);
        System.out.println(pc.college);*/

        ConstructorChaining cc=new ConstructorChaining();
        System.out.println("Default constructor values:");
        System.out.println(cc.brand);
        System.out.println(cc.color);
        System.out.println(cc.noOfWheels);
        System.out.println(cc.fuelTankCapacity);

        System.out.println("Chaining constructor:");
        ConstructorChaining cc1=new ConstructorChaining("RED");
        System.out.println(cc1.brand);
        System.out.println(cc1.color);
        System.out.println(cc1.noOfWheels);
        System.out.println(cc1.fuelTankCapacity);
    }
}
