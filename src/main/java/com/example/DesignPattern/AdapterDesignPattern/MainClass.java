package com.example.DesignPattern.AdapterDesignPattern;

import com.example.DesignPattern.AdapterDesignPattern.Adaptee.MenWeightMachine;
import com.example.DesignPattern.AdapterDesignPattern.Adapter.MenWeightMachineKg;

public class MainClass {
    public static void main(String[] args) {
        MenWeightMachineKg menWeightMachineKg = new MenWeightMachineKg(new MenWeightMachine());
        System.out.println(menWeightMachineKg.weightInKg());
    }
}
