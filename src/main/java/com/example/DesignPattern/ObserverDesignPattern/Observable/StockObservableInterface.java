package com.example.DesignPattern.ObserverDesignPattern.Observable;

import com.example.DesignPattern.ObserverDesignPattern.Observer.UserObserverInterface;

public interface StockObservableInterface {
    void add(UserObserverInterface obj);
    void remove(UserObserverInterface obj);
    void notifyMethod();
    int getCount();
    String getProductName();
}
