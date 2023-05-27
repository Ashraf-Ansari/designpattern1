package com.example.DesignPattern.BuilderDesignPattern;

public class Director {
    StudentBuilder studentBuilder;
    Director(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }

    Student createStudent(){
        return studentBuilder.setName("Ashraf").setAge(25).setFatherName("shafi").setRollNo(101).setClassNo(12).build();
    }
}
