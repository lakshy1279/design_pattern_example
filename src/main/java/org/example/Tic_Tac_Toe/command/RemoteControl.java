package org.example.Tic_Tac_Toe.command;

import java.util.Stack;

public class RemoteControl {
    Stack<Command>  commandStack = new Stack<>();
    // with the help of command we can change this at runtime
    // but if there is tight coupelling with gui then not able to do it.
    Command onCommand;
    Command offCommand;

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }

    public void undo() {
        if(!commandStack.isEmpty()) {
            Command command  = commandStack.pop();
            command.undo();
        }
    }

    public void pressOn() {
        if(onCommand.execute()){
            commandStack.push(onCommand);
        }
    }

    public void pressOff() {
        if(offCommand.execute()){
            commandStack.push(offCommand);
        }
    }
}
