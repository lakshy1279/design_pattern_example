package org.example.Tic_Tac_Toe.facade;



//It is used as a camouflage to cover the complexities of a large system and therefore provides a
// simple interface to the client.
public class OrderFacade {
    WaiterSystem waiter;
    KitchedSystem kitchen;
    public void orderFood()
    {
        System.out.println("A series of interdependent calls on various subsystems:");
        waiter.writeOrder();
        waiter.sendToKitchen();
        kitchen.prepareFood();
        kitchen.callWaiter();
        waiter.serveCustomer();
        kitchen.washDishes();
    }
}
