package com.example.DesignPattern.ChainOfResponseblity;

public class DebugLog extends LogProcessor{
    DebugLog(LogProcessor logProcessor) {
        super(logProcessor);
    }
    @Override
    public void log(int logType, String message) {
        if(logType==DEBUG){
            System.out.println("DEBUG LOG "+message);
        }
        else
        super.log(logType, message);
    }
}
