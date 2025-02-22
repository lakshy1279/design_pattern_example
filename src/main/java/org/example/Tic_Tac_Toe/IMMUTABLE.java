package org.example.Tic_Tac_Toe;

import java.util.ArrayList;
import java.util.List;

public final class IMMUTABLE {
    //class should be final so that it can not be extended
    // private members
    // intialized using constrcutors (not setters)
    // getter methods return the copy of the variables
    private final String name;
    private final List<Integer> arr;
    StringBuilder str = new StringBuilder();
    public IMMUTABLE(String name, List<Integer> arr) {
        this.name = name;
        this.arr = arr;
    }
    public String getName() {
        return name;
    }
    public List<Integer> getArr() {
        // here we return the copy
        return new ArrayList<>(arr);
    }
}
