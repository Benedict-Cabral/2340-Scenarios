public class Cash implements PaymentMethod{
    @Override
    public void makePayment(double price) {
        System.out.println("Payment of $" + price + " made with cash.");
    }
}
