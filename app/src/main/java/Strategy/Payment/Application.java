package Strategy.Payment;

import java.util.HashMap;
import java.util.Map;

public class Application {
    private static Map<String, Integer> priceOnProducts = new HashMap<>();
    private static PaymentModule paymentModule = new PaymentModule(new PayByPayPal());

    static {
        priceOnProducts.put("오브젝트", 2200);
        priceOnProducts.put("객체지향의 사실과 오해", 1850);
        priceOnProducts.put("데이터베이스", 1100);
        priceOnProducts.put("이것이 자바다", 890);
    }

    public static void main(String[] args) {
        int totalPrice = 0;

        totalPrice += priceOnProducts.get("오브젝트");
        totalPrice += priceOnProducts.get("데이터베이스");

        paymentModule.pay(totalPrice);
    }
}
