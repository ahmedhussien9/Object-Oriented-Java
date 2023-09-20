package Association;

public class Department {
    private String name;
    private int floor;

    public Department(String name, int floor) {
        this.name = name;
        this.floor = floor;
    }

    public String toString() {
        return "Department Name: " + name + " Department Floor: " + floor;
    }
}
