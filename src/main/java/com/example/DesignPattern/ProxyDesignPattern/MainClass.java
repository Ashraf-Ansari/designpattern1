package com.example.DesignPattern.ProxyDesignPattern;

public class MainClass {
    public static void main(String[] args) {
        EmpDaoProxy empDaoProxy = new EmpDaoProxy();
        empDaoProxy.updateById("Admin",5);
        empDaoProxy.updateById("User",5);

    }
}
