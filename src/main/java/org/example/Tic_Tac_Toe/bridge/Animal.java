package org.example.Tic_Tac_Toe.bridge;


//The animals don’t implement their own move()methods but they have a MoveLogic object that they refer to. The move() implementation is decoupled from the Animal interface. The benefit is that the code in the Animal class is cleaner, easy to understand and smaller.
//Bridge pattern decouples an abstraction from its implementation so that the two can vary independently
public interface Animal {
    void move();
}
