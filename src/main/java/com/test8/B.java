public class EmployeeController {
    private String name;
    private String city;

    // Let's return an int (say, Employee ID)
    public employee createEmployee(Employee employee) {
        return employee;  // Assuming Employee has getId()
    }

    public static void main(String args[]) {
        EmployeeController emp = new EmployeeController();
        Employee e = new Employee(101, "Akshay");  // Sample employee
        int id = emp.createEmployee(e);
        System.out.println("Created Employee ID: " + id);
    }
}

// Dummy Employee class
class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
