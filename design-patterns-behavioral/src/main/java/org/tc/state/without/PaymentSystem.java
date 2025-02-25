package org.tc.state.without;

public class PaymentSystem {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println("Current State is: "+order.currentState());
        order.processOrder(); // Moves to PROCESSED
        System.out.println("Current State is: "+order.currentState());
        order.processOrder(); // Moves to COMPLETED
        System.out.println("Current State is: "+order.currentState());
        order.processOrder(); // Already completed
    }
}
