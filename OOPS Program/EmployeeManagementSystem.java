import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    
    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Base Salary: " + baseSalary);
    }
}

interface Department {
    void assignDepartment();
    void getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private int workHours;
    private String departmentName;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, int workHours, String departmentName) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.departmentName = departmentName;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double calculateSalary() {
        return getBaseSalary() + (workHours * 100);
    }

    @Override
    public void assignDepartment() {
        System.out.println("Department Assigned: " + departmentName);
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Full Time Employee Department: " + departmentName);
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private String departmentName;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, String departmentName) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.departmentName = departmentName;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double calculateSalary() {
        return getBaseSalary() + (workHours * 50);
    }

    @Override
    public void assignDepartment() {
        System.out.println("Department Assigned: " + departmentName);
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Part Time Employee Department: " + departmentName);
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(101, "Arpit Jain", 20000, 8, "IT Department"));
        employees.add(new PartTimeEmployee(102, "Ajay Jain", 15000, 4, "HR Department"));
        employees.add(new FullTimeEmployee(103, "Rohit Sharma", 25000, 9, "Finance Department"));

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());

            if (emp instanceof Department) {
                ((Department) emp).getDepartmentDetails();
            }
            System.out.println();
        }
    }
}
