public class PaymentTest {
    public static void main(String[] args) {

        GooglePayGateway gpay = new GooglePayGateway();
        PaymentProcessor gpayAdapter = new GooglePayAdapter(gpay);
        gpayAdapter.processPayment(1499.00);

        PaytmGateway paytm = new PaytmGateway();
        PaymentProcessor paytmAdapter = new PaytmAdapter(paytm);
        paytmAdapter.processPayment(999.50);
    }
}
