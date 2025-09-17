package OOPs.EncapsulationPolymorphismInterfaceAbstractClass;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge = 2000;
    private java.util.List<String> records = new java.util.ArrayList<>();

    public InPatient(int id, String name, int age) { super(id, name, age); }

    @Override
    public double calculateBill() { return roomCharge * 5; } // fixed 5 days

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public void viewRecords() { System.out.println("Records: " + records); }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee = 500;
    private java.util.List<String> records = new java.util.ArrayList<>();

    public OutPatient(int id, String name, int age) { super(id, name, age); }

    @Override
    public double calculateBill() { return consultationFee; }

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public void viewRecords() { System.out.println("Records: " + records); }
}

public class Task7 {
    public static void main(String[] args) {
        Patient[] patients = {
                new InPatient(1, "Alice", 30),
                new OutPatient(2, "Bob", 25)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
        }
    }
}
