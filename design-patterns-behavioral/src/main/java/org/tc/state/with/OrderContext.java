package org.tc.state.with;

public class OrderContext {

    private OrderState state;

    public OrderContext() {
        this.state = new PendingState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.processOrder(this);
    }

    public OrderState getState() {
        return state;
    }
}
