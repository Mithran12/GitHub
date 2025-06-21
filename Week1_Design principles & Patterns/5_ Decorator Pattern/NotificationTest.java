public class NotificationTest {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier();

        Notifier emailAndSMS = new SMSNotifierDecorator(email);

        Notifier fullNotifier = new SlackNotifierDecorator(emailAndSMS);

        fullNotifier.send("Your order has been shipped.");
    }
}
