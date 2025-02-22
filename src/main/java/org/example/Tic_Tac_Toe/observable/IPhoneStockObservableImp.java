package org.example.Tic_Tac_Toe.observable;

import org.example.Tic_Tac_Toe.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class IPhoneStockObservableImp implements StocksObservable{
    List<NotificationAlertObserver> observers = new ArrayList<>();
    int currentStock = 0;
    @Override
    public void addObserver(NotificationAlertObserver observer) {
         observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
     for (NotificationAlertObserver observer : observers) {
        observer.update();
     }
    }

    @Override
    public void setStock(int newStock) {
       if(currentStock == 0) {
           currentStock = currentStock + newStock;
           notifyObservers();
       } else currentStock = currentStock + newStock;

    }

    @Override
    public String getStock() {
       return Integer.toString(currentStock);
    }
}
