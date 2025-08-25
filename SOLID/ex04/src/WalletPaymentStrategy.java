public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public String processPayment(double amount) {
        return "Wallet debit: " + amount;
    }
}
