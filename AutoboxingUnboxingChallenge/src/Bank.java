import java.util.ArrayList;

public class Bank  {
    private String name;
    private ArrayList <Branch> Branches;


    public Bank (String name) {
        this.name = name;
        this.Branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public boolean AddNewBranch(String name) {
        if (findBranch(name) == null) {
            this.Branches.add(new Branch(name));
            return true;
        }
        System.out.println("Branch already exists");
        return false;
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < this.Branches.size(); i++) {
            Branch checkedBranch = this.Branches.get(i);
            if (checkedBranch.getName().equals(name)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean addCustomer (String branchName, String customerName, double initialTransactionAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.createCustomer(customerName, initialTransactionAmount);
            return true;
        } else {
            System.out.println("Branch does not exist.");
            return false;
        }
    }

    public boolean addCustomerTransaction (String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addTransaction(customerName, amount);
            return true;
        } else {
            System.out.println("Branch not found");
            return false;
        }
    }

    public boolean listCustomers(String branchName) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("The customers for branch " + branch.getName() + " are as follows\n");
            branch.showListOfCustomers();
            return true;
        } else {
            System.out.println("Branch not found");
            return false;
        }
    }

    public boolean showTransactions(String branchName, String customerName) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.showListOfTransactions(customerName);
            return true;
        } else {
            System.out.println("Branch not found");
            return false;
        }
    }
}
