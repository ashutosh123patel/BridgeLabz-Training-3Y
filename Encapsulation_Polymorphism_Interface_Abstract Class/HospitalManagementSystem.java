import java.util.*;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
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

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected List<String> getMedicalHistory() {
        return Collections.unmodifiableList(medicalHistory);
    }

    protected void addHistoryRecord(String record) {
        medicalHistory.add(record);
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Diagnosis: " + diagnosis);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(int patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyRate) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        addHistoryRecord(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History of " + getName() + ": " + getMedicalHistory());
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addHistoryRecord(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History of " + getName() + ": " + getMedicalHistory());
    }
}

public class HospitalManagementSystem {
    public static void processPatients(List<Patient> patients) {
        for (Patient patient : patients) {
            patient.getPatientDetails();
            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.viewRecords();
            }
            System.out.println("Total Bill: " + patient.calculateBill());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient p1 = new InPatient(101, "Amit", 45, "Pneumonia", 5, 2000);
        OutPatient p2 = new OutPatient(102, "Sneha", 30, "Migraine", 500);

        p1.addRecord("Admitted on 10th Sept");
        p1.addRecord("Prescribed antibiotics");
        p2.addRecord("Consultation on 12th Sept");

        patients.add(p1);
        patients.add(p2);

        processPatients(patients);
    }
}
