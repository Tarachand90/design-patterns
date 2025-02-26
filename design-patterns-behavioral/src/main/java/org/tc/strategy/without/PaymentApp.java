package org.tc.strategy.without;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        service.pay("CREDIT_CARD", 100);
        service.pay("PAYPAL", 200);
        service.pay("UPI", 150);
    }
}
