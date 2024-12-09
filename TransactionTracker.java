import java.util.ArrayList;

public class TransactionTracker {
    private ArrayList<String> transactionHistory = new ArrayList<>();

    public void addTransaction(String transactionDetails) {
        transactionHistory.add(transactionDetails);
    }

    public void viewTransactionHistory() {
        System.out.println("\n" + "Transaction History: ");

        for (String transaction: transactionHistory) {
            System.out.println(transaction);
        }
    }
}