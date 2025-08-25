public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public String processPayment(double amount) {
        return "Charged card: " + amount;
    }
}
