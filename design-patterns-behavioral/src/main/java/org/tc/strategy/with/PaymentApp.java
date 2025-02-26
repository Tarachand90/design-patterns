package org.tc.strategy.with;

public class PaymentApp {
    public static void main(String[] args) {
        // Select payment method externally
        Payment paymentMethod = PaymentFactory.getPaymentMethod(PaymentType.CREDIT_CARD);
        PaymentContext context = new PaymentContext(paymentMethod);
        context.pay(100);

        paymentMethod = PaymentFactory.getPaymentMethod(PaymentType.PAYPAL);
        context = new PaymentContext(paymentMethod);
        context.pay(200);

        paymentMethod = PaymentFactory.getPaymentMethod(PaymentType.UPI);
        context = new PaymentContext(paymentMethod);
        context.pay(150);

        paymentMethod = PaymentFactory.getPaymentMethod(PaymentType.BITCOIN); // Invalid case
        context = new PaymentContext(paymentMethod);
        context.pay(500);
    }
}



