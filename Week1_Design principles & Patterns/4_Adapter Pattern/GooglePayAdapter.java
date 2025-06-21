public class GooglePayAdapter implements PaymentProcessor {
    private GooglePayGateway googlePay;

    public GooglePayAdapter(GooglePayGateway googlePay) {
        this.googlePay = googlePay;
    }

    @Override
    public void processPayment(double amount) {
        googlePay.sendPayment(amount);
    }
}
