import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int daysAdmitted;
    private List<String> records = new ArrayList<>();

    public InPatient(int patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
    }

    public double calculateBill() {
        return dailyCharge * daysAdmitted;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public List<String> viewRecords() {
        return records;
    }
}

public class HospitalManagementSystem {
    public static void processPatient(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Total Bill: " + patient.calculateBill());

        if (patient instanceof MedicalRecord) {
            MedicalRecord medicalRecord = (MedicalRecord) patient;
            System.out.println("Medical Records: " + medicalRecord.viewRecords());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InPatient inpatient = new InPatient(101, "Ram Sharma", 45, 2000, 5);
        OutPatient outpatient = new OutPatient(102, "Ankur Jain", 30, 500);

        inpatient.addRecord("Admitted for surgery");
        inpatient.addRecord("Underwent knee replacement");
        outpatient.addRecord("Consulted for fever");

        processPatient(inpatient);
        processPatient(outpatient);
    }
}
