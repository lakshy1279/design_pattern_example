package org.example.Tic_Tac_Toe.command;

public class OffCommand implements Command{

    AC ac;
    public OffCommand(AC ac) {
        this.ac = ac;
    }
    @Override
    public boolean execute() {
       ac.turnOff();
        return true;
    }

    @Override
    public void undo() {
        System.out.println("Performing undo of trun Off");
      ac.turnOn();
    }
}
