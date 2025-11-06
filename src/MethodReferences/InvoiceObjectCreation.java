package MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;
    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }
    public String toString() {
        return "Invoice generated for Transaction: " + transactionId;
    }
}
public class InvoiceObjectCreation {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");
        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());
        System.out.println("Generated Invoices:");
        invoices.forEach(System.out::println);
    }
}
