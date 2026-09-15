package com.joysistvi.stage2.discussion.day22;


public class CashPayment extends Payment {

    public CashPayment(double balance) {
        super(balance);
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using cash payment");
    }

    @Override
    public String getPaymentType() {
        return "Cash Payment";
    }
}
