import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customers> customersArrayList;

    public Branch(String name) {
        this.name = name;
        this.customersArrayList = new ArrayList<Customers>();
    }

    public boolean createCustomer(String name, double initialTransactionAmount) {
        if (findCustomer(name) == null) {
            Customers newCostumer = new Customers(name, initialTransactionAmount);
            customersArrayList.add(newCostumer);
            return true;
        }
        return false;
    }

    public void addTransaction(String customerName, double transactionAmount) {
        Customers customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transactionAmount);
            customer.addToInitialTransactionAmount(transactionAmount);
        } else {
            System.out.println("customer not found");
        }
    }

    public void showListOfCustomers() {
        for (int i = 0; i < customersArrayList.size(); i++) {
            System.out.println(i + 1 + ". " + customersArrayList.get(i).getName());
        }
    }

    public void showListOfTransactions(String name) {
        Customers customer = findCustomer(name);
        assert customer != null;
        for (int i = 0; i < customer.getTransactions().size(); i++) {
            System.out.println((i + 1) + ". " + customer.getTransactions().get(i));
        }
        System.out.println("total transaction amount of " + customer.getName() + " is " + customer.getInitialTransactionAmount());
    }


    private Customers findCustomer(String name) {
        for (int i = 0; i < this.customersArrayList.size() ; i++) {
            Customers checkedCustomer = this.customersArrayList.get(i);
            if (checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
