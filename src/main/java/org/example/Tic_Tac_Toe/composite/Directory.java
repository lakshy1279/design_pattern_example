package org.example.Tic_Tac_Toe.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> fileSystems;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        fileSystems = new ArrayList<>();
    }

    public void addFileSystem(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }
    @Override
    public void ls() {
        System.out.println("Directory Name: " + directoryName);
        for (FileSystem fileSystem : fileSystems) {
            fileSystem.ls();
        }
    }
}
