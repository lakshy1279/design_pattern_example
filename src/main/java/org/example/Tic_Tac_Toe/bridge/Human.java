package org.example.Tic_Tac_Toe.bridge;

public class Human implements Animal{
    MoveLogic moveLogic;
    public Human(MoveLogic moveLogic) {
        this.moveLogic = moveLogic;
    }

    public void move() {
        moveLogic.move();
    }
}
