package com.joysistvi.stage2.activity.day21;

public class ContractualEmployee extends Employee{

    private double hoursWorked;
    private double hourlyRate;

    public ContractualEmployee(String name, double baseSalary,
                               double hoursWorked) {
        super(name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeSalary() {
        return hoursWorked * hourlyRate;
    }
}
