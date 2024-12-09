public class CreditCard implements PaymentMethod {
    @Override
    public void makePayment(double price) {
        System.out.println("Payment of $" + price + " made with a credit card.");
    }
}

    