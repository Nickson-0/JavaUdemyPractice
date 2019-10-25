import java.util.ArrayList;

public class Customers {
    private String name;
    private Double initialTransactionAmount;
    private ArrayList <Double> transactions;

    public Customers(String name, double initialTransactionAmount) {
        this.name = name;
        this.initialTransactionAmount = initialTransactionAmount;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public Double getInitialTransactionAmount() {
        return initialTransactionAmount;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addToInitialTransactionAmount(double amount) {
        this.initialTransactionAmount += amount;
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }
}
