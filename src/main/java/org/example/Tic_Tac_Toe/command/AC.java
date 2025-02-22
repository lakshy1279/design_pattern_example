package org.example.Tic_Tac_Toe.command;

public class AC {
    String currentState;
    AC(){
        this.currentState = "OFF";
    }

    public void turnOn(){
        this.currentState = "ON";
        System.out.println("Ac turned on");
    }

    public void turnOff(){
        this.currentState = "OFF";
        System.out.println("Ac turned off");
    }
}
