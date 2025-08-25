public class TaxCalculator {
    private final double taxRate = 0.18;

    double calculateTotalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
