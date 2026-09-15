package com.joysistvi.stage2.discussion.day22;


// without inheritance no overriding
public class GCashPayment extends Payment implements Refundable, Traceable{

    double savings;

    // constructor
    public GCashPayment(double balance, double savings) {
        super(balance);
        this.savings = savings;
    }

    // Polymorphism: method overriding
    @Override  // double savings
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using GCash!");

    }

    // non abstract method
    @Override
    public String getPaymentType() {
        return "GCash Payment";
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " back to GCash Wallet");
    }

    @Override
    public String generateTransactionId() {
        return "GC-" + System.currentTimeMillis();
    }

    @Override
    public void logTransaction(String transactionId) {
        System.out.println("Transaction logged: " + transactionId);
    }
}

//        if (balance + savings > amount) {
//            System.out.println("Paid " + amount + " using GCash!");
//        }else {
//            System.out.println("Insufficient Funds... Mag cash in muna");
//        }