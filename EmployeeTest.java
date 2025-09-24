class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

public String getName() {
    return name;
}
 
public void setName(String name) {
    this.name = name;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;   
}

public String getDepartment() {
    return department;
}

public void setDepartment(String department) {
    this.department = department;
}

public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}
}

public class EmployeeTest {
    public static void main (String args[]) {

           Employee e1 = new Employee();
           e1.setName("Veronica");
           e1.setId(101);
           e1.setDepartment("HR");
           e1.setSalary(55000.0);

           Employee e2 = new Employee();
           e2.setName("Meera");
           e2.setId(201);
           e2.setDepartment("IT");
           e2.setSalary(70000.0);

           System.out.println("Employee 1 Details:");
           System.out.println("Name: " + e1.getName());
           System.out.println("ID: " + e1.getId());
           System.out.println("Department: " + e1.getDepartment());
           System.out.println("Salary: " + e1.getSalary());

           System.out.println("\nEmployee 2 Details:");
           System.out.println("Name: " + e2.getName());
           System.out.println("ID: " + e2.getId());
           System.out.println("Department: " + e2.getDepartment());
           System.out.println("Salary: " + e2.getSalary());

    }
}
