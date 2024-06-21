package basic.problems.strings;

public class StudentToString {
    String name;
    int age;
    String degree;
    char gender;

    StudentToString(String name, int age, String degree, char gender){
    this.name =  name;
    this.age = age;
    this.degree = degree;
    this.gender = gender;
    }

    @Override
    public String toString() {
        return StudentToString.class+"{ Name-"+name+", Age-"+age+", Degree-"+degree+", Gender-"+gender+"}";
    }

    public static void main(String[] args) {
        StudentToString std = new StudentToString("Manoj",23,"BE",'M');
        System.out.println(std.toString());
    }
}
