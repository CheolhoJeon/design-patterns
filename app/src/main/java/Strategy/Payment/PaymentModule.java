package Strategy.Payment;

public class PaymentModule {
    private PayStrategy strategy;

    public PaymentModule(final PayStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(int paymentAmount) {
        strategy.pay(paymentAmount);
    }
}
