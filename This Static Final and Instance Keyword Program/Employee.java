import java.util.WeakHashMap;

class Employee
{
    private static String companyName="Capgemini";
    private static int totalEmployee=0;
    private String name;
    private final int id;
    private String designation;
    public Employee(String name,String designation ,int id)
    {
        this.name=name;
        this.designation=designation;
        this.id=id;
        totalEmployee++;
    }
    public static void displayTotalEmployees()
    {
        System.out.println("Total Number of Employees : "+totalEmployee);
    }
    public void displayDetails()
    {
        if(this instanceof Employee)
        {
            System.out.println("Name of Employee : "+name);
            System.out.println("Designation of Employee : "+designation);
            System.out.println("Id of Employee : "+id);
            System.out.println();
        }
        else
        System.out.println("Invalid Employee Instance");
    }
    public static void main(String[] args) 
    {
        Employee e1=new Employee("Arpit Jain", "SDE 1", 202);
        Employee e2=new Employee("Ajay Jain","Senior Data Analyst",101);
        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();    
    }

}