package com.example.DesignPattern.CompositeDesignPAttern.FileSystem;

public class File implements FileSystem {
    String name;
    File(String name){this.name=name;}
    @Override
    public void ls() {
        System.out.println("file name "+name);
    }
}
