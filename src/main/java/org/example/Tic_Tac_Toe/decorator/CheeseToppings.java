package org.example.Tic_Tac_Toe.decorator;

public class CheeseToppings extends Toppings{
    BasePizza basePizza;
    public CheeseToppings(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + 30;
    }
}
