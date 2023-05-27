package com.example.DesignPattern.ObserverDesignPattern;

import com.example.DesignPattern.ObserverDesignPattern.Observable.IpadObservableImpl;
import com.example.DesignPattern.ObserverDesignPattern.Observable.IphoneObservableImpl;
import com.example.DesignPattern.ObserverDesignPattern.Observer.AshrafObserver;

public class MainClass {
    public static void main(String[] args) {
        IphoneObservableImpl obj1 = new IphoneObservableImpl();
        IpadObservableImpl obj3  = new IpadObservableImpl();
        AshrafObserver obj2 = new AshrafObserver("Ashraf","ashraf@gmail.com",obj1);
        AshrafObserver obj4 = new AshrafObserver("Afzal","adzal@gmail.com",obj3);
        obj1.add(obj2);
        obj3.add(obj4);
        obj1.setCount(2);
        obj3.setCount(2);
    }
}
