package org.example.Tic_Tac_Toe.observer;

import org.example.Tic_Tac_Toe.observable.IPhoneStockObservableImp;
import org.example.Tic_Tac_Toe.observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{

    StocksObservable stockObservable;
    String mobileNumber;
    public MobileAlertObserver(StocksObservable stockObservable, String mobileNumber) {
        this.stockObservable = stockObservable;
        this.mobileNumber = mobileNumber;
    }
    @Override
    public void update() {
       sendMessage("Stocks came back and current quantity is" + " " + stockObservable.getStock());
    }

    private void sendMessage(String message) {
        System.out.println("Message sent: " + message);
    }
}
