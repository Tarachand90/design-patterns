package org.tc.strategy.with;

public class PayPal implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
