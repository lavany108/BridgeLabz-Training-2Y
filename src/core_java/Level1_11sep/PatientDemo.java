package core_java.Level1_11sep;

class Patient {
    static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;
    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    public void displayDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
        } else {
            System.out.println("Invalid object! Not a Patient.");
        }
    }
}
public class PatientDemo {
    public static void main(String[] args) {
        Patient pt1 = new Patient(101, "Amit Verma", 45, "Diabetes");
        Patient pt2 = new Patient(102, "Sneha Gupta", 30, "Flu");
        pt1.displayDetails(pt1);
        pt2.displayDetails(pt2);
        Patient.getTotalPatients();
        pt1.displayDetails("Not a Patient Object");
    }
}
