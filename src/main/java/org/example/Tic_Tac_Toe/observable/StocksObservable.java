package org.example.Tic_Tac_Toe.observable;

import org.example.Tic_Tac_Toe.observer.NotificationAlertObserver;

public interface StocksObservable {

    void addObserver(NotificationAlertObserver observer);

    void removeObserver(NotificationAlertObserver observer);

    void notifyObservers();

    void setStock(int value);

    String getStock();
}
