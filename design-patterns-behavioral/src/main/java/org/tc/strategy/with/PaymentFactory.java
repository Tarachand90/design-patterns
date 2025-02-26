package org.tc.strategy.with;

public class PaymentFactory {
    public static Payment getPaymentMethod(PaymentType paymentType) {
        return switch (paymentType) {
            case PaymentType.CREDIT_CARD -> new CreditCard();
            case PaymentType.PAYPAL -> new PayPal();
            case PaymentType.UPI -> new UPI();
            default -> new NullPayment();
        };
    }
}
