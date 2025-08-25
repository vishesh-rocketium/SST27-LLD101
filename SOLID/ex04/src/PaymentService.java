
public class PaymentService {
    private final PaymentStrategy cardStrategy = new CardPaymentStrategy();
    private final PaymentStrategy upiStrategy = new UpiPaymentStrategy();
    private final PaymentStrategy walletStrategy = new WalletPaymentStrategy();

    String pay(Payment p) {
        PaymentStrategy strategy = getStrategy(p.provider);
        return strategy.processPayment(p.amount);
    }

    private PaymentStrategy getStrategy(String provider) {
        switch (provider) {
            case "CARD":
                return cardStrategy;
            case "UPI":
                return upiStrategy;
            case "WALLET":
                return walletStrategy;
            default:
                throw new RuntimeException("No provider");
        }
    }
}