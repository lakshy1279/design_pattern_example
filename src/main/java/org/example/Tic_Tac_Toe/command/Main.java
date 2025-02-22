package org.example.Tic_Tac_Toe.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AC ac = new AC();
        Command onCommand = new OnCommand(ac);
        Command offCommand = new OffCommand(ac);
        RemoteControl remote = new RemoteControl();
        remote.setOffCommand(offCommand);
        remote.setOnCommand(onCommand);
        remote.pressOn();
        remote.undo();
        remote.pressOff();

        List<Integer> str = new ArrayList<>();
        Iterator it = str.iterator();
    }
}
