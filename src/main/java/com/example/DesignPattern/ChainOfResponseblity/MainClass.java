package com.example.DesignPattern.ChainOfResponseblity;

public class MainClass {
    public static void main(String[] args) {
        LogProcessor error = new ErrorLog(null);
        LogProcessor debug = new DebugLog(error);
        LogProcessor log = new InfoLog(debug);
        log.log(1,"info message");
        log.log(2,"debug message");
        log.log(3,"error message");
    }
}
