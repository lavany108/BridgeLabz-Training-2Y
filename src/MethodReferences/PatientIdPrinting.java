package MethodReferences;

import java.util.Arrays;
import java.util.List;
public class PatientIdPrinting {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("P101", "P102", "P103", "P104");
        System.out.println("Patient IDs for Admin Verification:");
        patientIDs.forEach(System.out::println);
    }
}
