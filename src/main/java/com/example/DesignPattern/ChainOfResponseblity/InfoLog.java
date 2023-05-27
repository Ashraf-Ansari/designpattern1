package com.example.DesignPattern.ChainOfResponseblity;

public class InfoLog extends LogProcessor {

    InfoLog(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logType, String message) {
        if(logType==INFO){
            System.out.println("INFO LOGS "+message);
        }
        else{
            super.log(logType,message);
        }
    }
}
