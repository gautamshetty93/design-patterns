public class Employee implements Prototype {

    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public Prototype clone() {
        return new Employee(this.name, this.department, this.salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name +
                "', department='" + department +
                "', salary=" + salary + "}";
    }
}