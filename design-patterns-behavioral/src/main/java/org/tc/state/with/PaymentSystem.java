package org.tc.state.with;

public class PaymentSystem {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.processOrder(); // Moves to PROCESSED
        order.processOrder(); // Moves to COMPLETED
        order.processOrder(); // Already completed
    }
}
