package org.example.Tic_Tac_Toe.adapter;

// this is adapter we make for communication with bank
public interface BankApi {
    void processPayment(double amount, String accountNo);
}
