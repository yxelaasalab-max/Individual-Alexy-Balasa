package com.joysistvi.stage2.discussion.day20;

// without inheritance no overriding
public class GCashPayment extends Payment {

    double savings;

    // constructor
    public GCashPayment(double balance) {
        super(balance);
        this.savings = savings;
    }

    // Polymorphism: method overriding
    @Override  // double savings
    void pay(double amount) {
        System.out.println("Paid " + amount + " using GCash!");

    }
}

//        if (balance + savings > amount) {
//            System.out.println("Paid " + amount + " using GCash!");
//        }else {
//            System.out.println("Insufficient Funds... Mag cash in muna");
//        }