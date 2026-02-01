package com.streamapi.forEach;
import java.time.LocalDateTime;
import java.util.List;

public class TransactionLogger {
    public static void main(String[] args) {

        List<String> transactions = List.of("TXN1001", "TXN1002", "TXN1003");

        transactions.forEach(txn ->
            System.out.println(
                "Transaction: " + txn +
                " | Time: " + LocalDateTime.now()
            )
        );
    }
}
