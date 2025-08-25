public class UpiPaymentStrategy implements PaymentStrategy {
    @Override
    public String processPayment(double amount) {
        return "Paid via UPI: " + amount;
    }
}
