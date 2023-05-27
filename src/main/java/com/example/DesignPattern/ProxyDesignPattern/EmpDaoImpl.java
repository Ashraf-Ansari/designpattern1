package com.example.DesignPattern.ProxyDesignPattern;

import java.util.List;

public class EmpDaoImpl implements EmpDao{
    @Override
    public void updateById(String client,int id) {
        System.out.println("updated by id");
    }

    @Override
    public void deleteById(String client,int id) {
        System.out.println("delete by id");
    }

    @Override
    public void updateByNumber(String client,int number) {
        System.out.println("update by number");
    }

    @Override
    public void deleteByNumber(String client,int number) {
        System.out.println("delete by number");
    }

    @Override
    public List<Integer> findAll(String client) {
        System.out.println("find all");
        return null;
    }

    @Override
    public int findById(String client,int id) {
        System.out.println("find by id");
        return 0;
    }
}
