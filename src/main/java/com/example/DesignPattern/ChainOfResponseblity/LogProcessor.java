package com.example.DesignPattern.ChainOfResponseblity;

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    public static int LOG = 4;
    LogProcessor nextLogProcessor;
    LogProcessor(LogProcessor logProcessor){
        nextLogProcessor = logProcessor;
    }
    public  void log(int logType , String message){
        if(nextLogProcessor!=null)
        {
            nextLogProcessor.log(logType,message);
        }
    }
}
