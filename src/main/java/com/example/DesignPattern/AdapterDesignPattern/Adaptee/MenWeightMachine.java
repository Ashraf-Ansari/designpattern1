package com.example.DesignPattern.AdapterDesignPattern.Adaptee;

public class MenWeightMachine implements WeightMachineAdaptee {
    @Override
    public double getweightMachineInPound() {
        return 130;
    }
}
