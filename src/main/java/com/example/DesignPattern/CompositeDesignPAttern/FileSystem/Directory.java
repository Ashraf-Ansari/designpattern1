package com.example.DesignPattern.CompositeDesignPAttern.FileSystem;

import com.example.DesignPattern.CompositeDesignPAttern.FileSystem.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> fileSystemList = new ArrayList<>();
    Directory(String directoryName){this.directoryName=directoryName;}
    @Override
    public void ls() {
        System.out.println("directory name "+directoryName);
        for (FileSystem fileSystem :fileSystemList){
            fileSystem.ls();
        }
    }
    void add(FileSystem file){
        fileSystemList.add(file);
    }
}
