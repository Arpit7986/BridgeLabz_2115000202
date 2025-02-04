class Student
{
    private static String universityName="GLA University Mathura";
    private static int totalStudent=0;
    private String name;
    private final int rollNumber;
    private String grade;
    public Student(String name,int rollNumber,String grade)
    {
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        ++totalStudent;
    }
    public static void displayTotalStudents()
    {
        System.out.println("Total Number of Students are "+totalStudent);
    }
    public void displayDetails()
    {
        if(this instanceof Student)
        {
            System.out.println("Student Name : "+name);
            System.out.println("Student Roll No : "+rollNumber);
            System.out.println("Student Grade : "+grade);
            System.out.println();
        }
        else
        System.out.println("Invalid Student Instance");
    }
    public static void main(String args[])
    {
        Student s1=new Student("Arpit Jain", 202, "A+");
        Student s2=new Student("Ajay Jain",101, "O+");
        s1.displayDetails();
        s2.displayDetails();
        Student.displayTotalStudents();
    }
}