package com.joysistvi.stage1.day4;

public class Activity2_Balasa {

    public static void main(String[] args) {

        double income = 50000;

        double foodAllowance = 15000;
        double foodPercentage = (foodAllowance / income) * 100;
        System.out.println("foodAllowance: " + foodPercentage + "%");

        double transportation = 2500;
        double transportationPercentage = (transportation / income) * 100;
        System.out.println("transportation: " + transportationPercentage + "%");

        double rent = 4500;
        double rentPercentage = (rent / income) * 100;
        System.out.println("rent: " + rentPercentage + "%");

        double utilityBill = 3500;
        double utilityBillPercentage = (utilityBill / income) * 100;
        System.out.println("utilityBill: " + utilityBillPercentage + "%");

        //total expenses
        double expenses = (foodAllowance + transportation + rent + utilityBill);
        System.out.println("totalExpenses: " + expenses);

        //total remainingBalance
        double remainingBalance = (income - expenses);
        System.out.println("totalRemainingBalance: " + remainingBalance);
    }
}
