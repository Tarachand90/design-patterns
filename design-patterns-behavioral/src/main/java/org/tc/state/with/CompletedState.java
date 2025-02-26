package org.tc.state.with;

public class CompletedState implements OrderState {

    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Order is already completed. No further processing.");
    }

}
