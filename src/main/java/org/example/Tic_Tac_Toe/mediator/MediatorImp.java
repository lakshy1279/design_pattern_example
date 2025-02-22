package org.example.Tic_Tac_Toe.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImp implements Mediator {

    private List<Collegue> bidders;

    public MediatorImp(){
        bidders = new ArrayList<>();
    }

    @Override
    public void placeBid(double amount, Collegue collegue) {
        System.out.println("Recieved Bid " + amount + " from " + collegue.getName());
        for(Collegue c : bidders){
            if(!c.equals(collegue)){
               c.receiveBidNotification(amount);
            }
        }
    }

    @Override
    public void add(Collegue bidder) {
        bidders.add(bidder);
    }
}
