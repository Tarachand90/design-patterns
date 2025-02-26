package org.tc.strategy.without;

public class PaymentService {

    public void pay(String paymentMethod, double amount) {
        switch (paymentMethod.toLowerCase()) {
            case "credit_card" -> {
                System.out.println("Processing credit card payment of $" + amount);
            }
            case "paypal" -> {
                System.out.println("Processing PayPal payment of $" + amount);
            }

            case "upi" -> {
                System.out.println("Processing UPI payment of $" + amount);
            }

            default -> System.out.println("Invalid payment method!");
        }
    }
}
