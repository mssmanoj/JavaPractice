package basic.problems.oopschallenges.encapsulation.com.example.employee;

public class ShowEmployeeDetails {
    public static void main(String[] args) {
        EmployeeDetails employeeDetails = new EmployeeDetails("Manoj",1,23000);
        System.out.println("Hi "+employeeDetails.getEmpName());
        employeeDetails.setEmpName("Aditya");
        System.out.println(employeeDetails.showEmployeeDetails());
    }
}
