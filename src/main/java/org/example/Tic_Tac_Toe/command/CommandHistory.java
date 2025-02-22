package org.example.Tic_Tac_Toe.command;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    List<Command> commandHistory;
    public CommandHistory() {
        commandHistory = new ArrayList<>();
    }
    public void add(Command command) {
        commandHistory.add(command);
    }

    public void undo() {
        commandHistory.remove(commandHistory.size() - 1);
    }
}
