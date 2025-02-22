package org.example.Tic_Tac_Toe.bridge;

public class Fly implements MoveLogic{
    @Override
    public void move() {
        System.out.println("Flying using wings");
    }
}
