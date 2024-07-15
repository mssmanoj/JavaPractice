package basic.problems.collection_framework.collection.comparator;

public class Student {
    public int id;
    public String name;
    public String standard;
    public int phone;

    public Student(int id, String name, String standard, int phone){
        this.id = id;
        this.name = name;
        this.standard = standard;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", standard='" + standard + '\'' +
                ", phone=" + phone +
                '}';
    }
}
