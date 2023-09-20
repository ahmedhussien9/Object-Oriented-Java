package Association;

public class Main {
    public static void main(String[] args) {
        Department department = new Department("Computer Science", 3);
        Student student = new Student("Ahmed Hussien", "123", 30, department);
        System.out.println(student.toString());
    }
}
