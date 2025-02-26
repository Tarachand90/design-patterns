package org.tc.strategy.with;

public class NullPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Invalid payment method!");
    }
}
