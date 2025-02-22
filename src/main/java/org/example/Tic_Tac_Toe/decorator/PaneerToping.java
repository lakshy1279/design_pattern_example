package org.example.Tic_Tac_Toe.decorator;

public class PaneerToping extends Toppings{
    BasePizza basePizza;
    public PaneerToping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + 40;
    }
}
