package org.tc.strategy.with;

public class UPI implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}
