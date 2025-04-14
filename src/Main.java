class Employee {
    int id;
    String firstName;
    String lastName;
    double salary;

    Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    String getName() {
        return firstName + " " + lastName;
    }

    double getAnnualSalary() {
        return salary * 12;
    }

    void raiseSalary(double amount) {
        salary += amount;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "James", "Bond", 5000);
        System.out.println(emp);
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        emp.raiseSalary(500);
        System.out.println("After Raise: " + emp);
    }
}