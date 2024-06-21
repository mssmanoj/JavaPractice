package basic.problems.oopschallenges.encapsulation.com.example.employee;

class EmployeeDetails {
    private String empName;
    private int empNo;
    private double salary;

    EmployeeDetails(String empName, int empNo, double salary) {
        this.empName = empName;
        this.empNo = empNo;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

     String showEmployeeDetails() {
        return "Employee Name:" + empName + ", Employee Number:" + empNo + ", Salary:" + salary;
    }

}
