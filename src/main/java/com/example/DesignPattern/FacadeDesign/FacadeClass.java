package com.example.DesignPattern.FacadeDesign;

public class FacadeClass {
    private EmpDao empDao;
    FacadeClass(){
        empDao=new EmpDao();
    }
    public void inset(){
        empDao.insert();
    }
}
