public class PaymentHandler {

    private PaymentMethod paymentMethod;
    private TransactionTracker transactionTracker;

    public PaymentHandler(TransactionTracker transactionTracker) {
        this.transactionTracker = transactionTracker;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(double price) {
        paymentMethod.makePayment(price);
        transactionTracker.addTransaction("Payment of $" + price + " using: " + paymentMethod.getClass().getSimpleName() + ".");
    }
}