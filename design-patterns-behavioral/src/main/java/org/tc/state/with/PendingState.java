package org.tc.state.with;

public class PendingState implements OrderState{

    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Order is in Pending state. Processing payment...");
        context.setState(new ProcessedState());
    }
}
