package org.example.Tic_Tac_Toe.mediator;

public class Bidder implements Collegue{

    private Mediator mediator;
    private String name;
    public Bidder(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    @Override
    public void receiveBidNotification(double bidAmount) {
        System.out.println("Bid received: " + bidAmount);
    }

    @Override
    public void placeBid(double amount) {
       mediator.placeBid(amount, this);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
