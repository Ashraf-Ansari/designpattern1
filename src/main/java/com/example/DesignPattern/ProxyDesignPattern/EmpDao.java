package com.example.DesignPattern.ProxyDesignPattern;

import java.util.List;

public interface EmpDao {
    void updateById(String client,int id);
    void deleteById(String client,int id);
    void updateByNumber(String client,int number);
    void deleteByNumber(String client,int number);
    List<Integer> findAll(String client);
    int findById(String client,int id);
}
