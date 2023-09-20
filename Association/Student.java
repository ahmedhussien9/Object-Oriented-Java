package Association;

// Association loose relationship between two objects
public class Student {
    private String name;
    private String id;
    private int age;

    private Department department;

    public Student(String name, String id, int age, Department department) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public String getIdNum() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Student Name: " + name + ", ID: " + id + ", Department: " + department.toString();
    }
}
