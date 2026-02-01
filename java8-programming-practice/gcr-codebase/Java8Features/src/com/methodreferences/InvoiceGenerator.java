package com.methodreferences;
import java.util.List;

class Invoice {
    int transactionId;

    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice for Transaction ID: " + transactionId;
    }
}

public class InvoiceGenerator {

    public static void main(String[] args) {

        List<Integer> transactionIds = List.of(5001, 5002, 5003);

        transactionIds.stream()
                      .map(Invoice::new)   // Constructor reference
                      .forEach(System.out::println);
    }
}
