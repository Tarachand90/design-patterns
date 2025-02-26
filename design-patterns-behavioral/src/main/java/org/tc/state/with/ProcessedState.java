package org.tc.state.with;

public class ProcessedState implements OrderState{

    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Order is Processed. Preparing for shipment...");
        context.setState(new CompletedState());
    }

}
