package com.example.DesignPattern.ProxyDesignPattern;

import java.util.List;

public class EmpDaoProxy implements EmpDao{

    private EmpDao empDao;
    EmpDaoProxy(){this.empDao=new EmpDaoImpl();}

    @Override
    public void updateById(String client, int id) {
        if(client.equalsIgnoreCase("Admin"))
            empDao.updateById(client,id);
        else System.out.println("don't have access");
    }

    @Override
    public void deleteById(String client,int id) {
        if(client.equalsIgnoreCase("Admin"))
            empDao.deleteById(client,id);
        else System.out.println("don't have access");
    }

    @Override
    public void updateByNumber(String client,int number) {
        if(client.equalsIgnoreCase("Admin"))
            empDao.updateByNumber(client,number);
        else System.out.println("don't have access");
    }

    @Override
    public void deleteByNumber(String client,int number) {
        if(client.equalsIgnoreCase("Admin"))
            empDao.deleteByNumber(client,number);
        else System.out.println("don't have access");
    }

    @Override
    public List<Integer> findAll(String client) {
        empDao.findAll(client);
        return null;
    }

    @Override
    public int findById(String client,int id) {
        empDao.findById(client,id);
        return 0;
    }
}
