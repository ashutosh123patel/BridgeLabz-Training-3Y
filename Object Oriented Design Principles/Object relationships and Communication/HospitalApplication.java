import java.util.ArrayList;

class Patient {
    String name;
    int patientId;
    ArrayList<Doctor> consultedDoctors = new ArrayList<>();

    Patient(String name, int patientId) {
        this.name = name;
        this.patientId = patientId;
    }

    void addConsultation(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    void showConsultations() {
        System.out.println(name + " has consulted with:");
        for (Doctor d : consultedDoctors) {
            System.out.println("- " + d.name);
        }
    }
}

class Doctor {
    String name;
    int doctorId;

    Doctor(String name, int doctorId) {
        this.name = name;
        this.doctorId = doctorId;
    }

    void consult(Patient patient) {
        System.out.println(name + " is consulting patient " + patient.name);
        patient.addConsultation(this);
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void showDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor d : doctors) {
            System.out.println("- " + d.name);
        }
    }

    void showPatients() {
        System.out.println("Patients in " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

public class HospitalApplication {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doc1 = new Doctor("Dr. Smith", 101);
        Doctor doc2 = new Doctor("Dr. Alice", 102);

        Patient pat1 = new Patient("John", 201);
        Patient pat2 = new Patient("Priya", 202);

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);

        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        
        doc1.consult(pat1);
        doc1.consult(pat2);
        doc2.consult(pat2);

    
        hospital.showDoctors();
        hospital.showPatients();

        pat1.showConsultations();
        pat2.showConsultations();
    }
}
