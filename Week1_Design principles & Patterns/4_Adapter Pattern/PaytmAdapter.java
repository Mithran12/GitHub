public class PaytmAdapter implements PaymentProcessor {
    private PaytmGateway paytm;

    public PaytmAdapter(PaytmGateway paytm) {
        this.paytm = paytm;
    }

    @Override
    public void processPayment(double amount) {
        paytm.makePaytmTransaction(amount);
    }
}
