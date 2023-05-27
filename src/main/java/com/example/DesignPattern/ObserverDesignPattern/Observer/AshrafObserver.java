package com.example.DesignPattern.ObserverDesignPattern.Observer;

import com.example.DesignPattern.ObserverDesignPattern.Observable.StockObservableInterface;

public class AshrafObserver implements UserObserverInterface {

    private StockObservableInterface stockObservableInterface;
    String name;
    String email;
    public AshrafObserver(String name, String email, StockObservableInterface stockObservableInterface){
        this.email=email;
        this.name=name;
        this.stockObservableInterface=stockObservableInterface;
    }
    @Override
    public void update() {
            System.out.println("notified for "+stockObservableInterface.getProductName() +"name "+name + " email "+ email);
    }
}
