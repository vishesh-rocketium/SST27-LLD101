public class EmailService {
    private final EmailClient emailClient;

    public EmailService() {
        this.emailClient = new EmailClient();
    }

    void sendOrderConfirmation(String customerEmail, double total) {
        emailClient.send(customerEmail, "Thanks! Your total is " + total);
    }
}
