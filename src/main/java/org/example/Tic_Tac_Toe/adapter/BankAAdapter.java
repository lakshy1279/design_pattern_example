package org.example.Tic_Tac_Toe.adapter;

// simplaiy we have other bank adapter also
public class BankAAdapter implements BankApi{
    private BankARestService bankAService;
    public BankAAdapter(BankARestService bankAService) {
        this.bankAService = bankAService;
    }

    // our code everywhere use process payment function irrespective of the bank
    // this give us the flexibility of changing bank without doing any code change just by
    // configuration change
    //in case of upi Npci issue one interface which implement by all the bank
    // And all users like phone, paytm also consuming the same interface which
    // act like a adapter.
    @Override
    public void processPayment(double amount, String accountNo) {
        bankAService.sendPaymentRequest(amount, accountNo);
    }
}
