public class OrderService {
    private final TaxCalculator taxCalculator;
    private final EmailService emailService;

    public OrderService() {
        this.taxCalculator = new TaxCalculator();
        this.emailService = new EmailService();
    }

    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculateTotalWithTax(subtotal);
        emailService.sendOrderConfirmation(customerEmail, total);
        System.out.println("Order stored (pretend DB).");
    }
}