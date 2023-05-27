package com.example.DesignPattern.BuilderDesignPattern;

public class Student {
    int rollNo;
    String name,fatherName,motherName;
    int classNo,age;

    Student(StudentBuilder studentBuilder){
        this.rollNo=studentBuilder.rollNo;
        this.name=studentBuilder.name;
        this.fatherName=studentBuilder.fatherName;
        this.motherName=studentBuilder.motherName;
        this.classNo=studentBuilder.classNo;
        this.age=studentBuilder.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", classNo=" + classNo +
                ", age=" + age +
                '}';
    }
}
