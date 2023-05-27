package com.example.DesignPattern.AdapterDesignPattern.Adapter;

import com.example.DesignPattern.AdapterDesignPattern.Adaptee.WeightMachineAdaptee;

public class MenWeightMachineKg implements WeightMachineAdapter{
    private WeightMachineAdaptee weightMachineAdaptee;

    public MenWeightMachineKg(WeightMachineAdaptee weightMachineAdaptee){
        this.weightMachineAdaptee = weightMachineAdaptee;
    }
    @Override
    public double weightInKg() {
        return weightMachineAdaptee.getweightMachineInPound()*0.45;
    }
}
