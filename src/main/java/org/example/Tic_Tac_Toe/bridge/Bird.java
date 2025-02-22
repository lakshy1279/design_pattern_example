package org.example.Tic_Tac_Toe.bridge;

public class Bird implements Animal{
    MoveLogic moveLogic;
    public Bird(MoveLogic moveLogic) {
        this.moveLogic = moveLogic;
    }

    public void move() {
        moveLogic.move();
    }
}
