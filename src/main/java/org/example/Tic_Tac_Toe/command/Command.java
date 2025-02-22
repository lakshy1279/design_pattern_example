package org.example.Tic_Tac_Toe.command;

public interface Command {
    public boolean execute();
    public void undo();
}
