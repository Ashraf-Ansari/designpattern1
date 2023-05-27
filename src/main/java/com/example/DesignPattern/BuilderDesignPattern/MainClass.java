package com.example.DesignPattern.BuilderDesignPattern;

public class MainClass {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        Director director = new Director(studentBuilder);
        System.out.println(director.createStudent().toString());
    }
}
