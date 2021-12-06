package Strategy.Payment;

public class PayByCreditCard implements PayStrategy {
    @Override
    public void pay(int paymentAmount) {
        System.out.println(paymentAmount + "원을 신용카드로 결제합니다!");
    }
}
