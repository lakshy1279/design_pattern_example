package org.example.Tic_Tac_Toe.composite;

public class File implements FileSystem{

    String name;
    public File(String name){
        this.name = name;
    }
    @Override
    public void ls() {
        System.out.println("File Name" + " " + name);
    }
}
