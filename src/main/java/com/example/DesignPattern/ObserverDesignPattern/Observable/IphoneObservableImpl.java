package com.example.DesignPattern.ObserverDesignPattern.Observable;

import com.example.DesignPattern.ObserverDesignPattern.Observable.StockObservableInterface;
import com.example.DesignPattern.ObserverDesignPattern.Observer.UserObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservableInterface {
    List<UserObserverInterface> userObserverInterfaceList = new ArrayList<>();
    String productName = "Iphone notified";
    int count = 0;

    @Override
    public void add(UserObserverInterface obj) {
        userObserverInterfaceList.add(obj);
    }

    @Override
    public void remove(UserObserverInterface obj) {
        userObserverInterfaceList.remove(obj);
    }

    @Override
    public void notifyMethod() {
        for(UserObserverInterface obj:userObserverInterfaceList){
            obj.update();
        }
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    public void setCount(int count) {
        this.count = count;
        if(count!=0)
            notifyMethod();
    }
}
