package basic.problems.object_class.person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Manoj",24);
        Person person2 = new Person("Manoj", 24);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1.equals(person2));
    }
}
