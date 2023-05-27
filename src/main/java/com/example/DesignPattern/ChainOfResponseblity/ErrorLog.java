package com.example.DesignPattern.ChainOfResponseblity;

public class ErrorLog extends LogProcessor{
    ErrorLog(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logType, String message) {
        if(logType==ERROR){
            System.out.println("ERROR LOG "+message);
        }else
        super.log(logType, message);
    }
}
