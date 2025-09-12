class Patient {

    private static String hospitalTitle;
    private static int totalPatients = 0;

    private final String patientCode;
    private String patientName;
    private int age;
    private String ailment;

    public Patient(String patientName, int age, String ailment, String patientCode) {
        this.patientName = patientName;
        this.age = age;
        this.ailment = ailment;
        this.patientCode = patientCode;
        totalPatients++;
    }

    public static void setHospitalTitle(String title) {
        hospitalTitle = title;
    }

    public static int showTotalPatients() {
        return totalPatients;
    }

    public void showPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalTitle);
            System.out.println("Patient ID: " + patientCode);
            System.out.println("Name: " + patientName);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Object is not an instance of Patient class.");
        }
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public String getAilment() {
        return ailment;
    }

    public String getPatientCode() {
        return patientCode;
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient.setHospitalTitle("Central City Hospital");

        Patient patient1 = new Patient("Lathika", 30, "Flu", "PT001");
        Patient patient2 = new Patient("Lidiya", 45, "Fracture", "PT002");

        System.out.println("Total Patients Admitted: " + Patient.showTotalPatients());

        patient1.showPatientDetails();
        System.out.println();
        patient2.showPatientDetails();
    }
}
