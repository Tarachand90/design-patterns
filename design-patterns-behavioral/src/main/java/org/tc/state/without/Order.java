package org.tc.state.without;

public class Order {

    private OrderState state;

    public Order() {
        // Default state
        this.state = OrderState.PENDING;
    }

    public void processOrder() {
        switch (state) {
            case PENDING -> {
                System.out.println("Order is in Pending state. Processing payment...");
                state = OrderState.PROCESSED;
            }

            case PROCESSED -> {
                System.out.println("Order is Processed. Preparing for shipment...");
                state = OrderState.COMPLETED;
            }

            case COMPLETED -> {
                System.out.println("Order is already completed. No further processing.");

            }
            default -> System.out.println("Unknown order state.");
            }
        }

        public OrderState currentState() {
            return state;
        }
}
