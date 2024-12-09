public class Main {
    public static void main (String[] args) {

        /* 
         * AUTHORS:
         * Amiti Arunmozhi
         * Benedict Cabral
         * Padmanaban Saravanan
         * Romir Varshney
         * Alan Zhu
         * 
         * Strategy Pattern Implemented
         * Each transaction is logged automatically with the call of the makePayment() method. 
         * Users can see their transaction history
         *
         */
    
         TransactionTracker transactionTracker = new TransactionTracker();
         PaymentHandler paymentHandler = new PaymentHandler(transactionTracker);
 
         paymentHandler.setPaymentMethod(new CreditCard());
         paymentHandler.makePayment(150); 
 
         paymentHandler.setPaymentMethod(new Venmo());
         paymentHandler.makePayment(3450.0); 
       
         paymentHandler.setPaymentMethod(new Cash());
         paymentHandler.makePayment(2020.0);  
        
         transactionTracker.viewTransactionHistory(); 
    }
}