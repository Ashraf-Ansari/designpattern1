package com.example.DesignPattern.CompositeDesignPAttern.FileSystem;

public class MainClass {
    public static void main(String[] args) {
        FileSystem file1 = new File("Ashraf1.java");
        FileSystem file2 = new File("Ashraf2.java");
        FileSystem file3 = new File("Ashraf3.java");
        FileSystem file4 = new File("Ashraf4.java");
        Directory d1 = new Directory("d1");
        Directory d2 = new Directory("d2");
        Directory d3 = new Directory("d2");
        d1.add(file1);
        d2.add(file2);
        d2.add(file4);
        d3.add(file3);
        d1.add(d2);
        d1.add(d3);
        d1.ls();
    }
}
