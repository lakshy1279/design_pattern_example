package org.example.Tic_Tac_Toe.command;

public class OnCommand implements Command{
    AC ac;

    public OnCommand(AC ac) {
        this.ac = ac;
    }
    @Override
    public boolean execute() {
      ac.turnOn();
        return true;
    }

    @Override
    public void undo() {
       ac.turnOff();
    }
}
