class Patient
{
    private static String hospitalName="Synergy Plus";
    private static int totalPatient=0;
    private String name;
    private int age;
    private String ailment;
    private final int patientID;
    public Patient(String name,int age,String ailment,int patientID)
    {
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        this.patientID=patientID;
        totalPatient++;
    }
    public static void getTotalPatients()
    {
        System.out.println("Total Number Of Patients are "+totalPatient);
    }
    public void displayDetails()
    {
        if(this instanceof Patient)
        {
            System.out.println("Patient Name : "+name);
            System.out.println("Patient Age : "+age);
            System.out.println("Patient Ailment : "+ailment);
            System.out.println("Patient Id : "+patientID);
            System.out.println();
        }
        else
        System.out.println("Invalid Patient Instance");
    }
    public static void main(String[] args)
    {
        Patient p1=new Patient("Adil",50, "TB",101);
        Patient p2=new Patient("Suresh", 40, "Eye-Flu",102);
        p1.displayDetails();
        p2.displayDetails();
        Patient.getTotalPatients();    
    }
}