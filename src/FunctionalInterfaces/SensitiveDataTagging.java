package FunctionalInterfaces;

interface SensitiveData { }

class PatientRecord implements SensitiveData {
    String patientName;
    String diagnosis;

    PatientRecord(String patientName, String diagnosis) {
        this.patientName = patientName;
        this.diagnosis = diagnosis;
    }
}
public class SensitiveDataTagging {
    public static void main(String[] args) {
        PatientRecord record = new PatientRecord("Ansh", "Heart Checkup");

        if (record instanceof SensitiveData) {
            System.out.println("Encrypting patient record before saving...");
        } else {
            System.out.println("Normal data, no encryption needed.");
        }
    }
}
