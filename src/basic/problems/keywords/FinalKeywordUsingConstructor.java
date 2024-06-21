package basic.problems.keywords;

public class FinalKeywordUsingConstructor {
    String name;
    int age;
    final String gender;

    FinalKeywordUsingConstructor(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "FinalKeywordUsingConstructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        FinalKeywordUsingConstructor fc = new FinalKeywordUsingConstructor("Manoj", 23, "Male");
        System.out.println(fc.toString());
    }
}
