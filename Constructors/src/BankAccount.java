public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("1111", 0.00, "jBloggs@yahoo.ru", "Joe Bloggs", "89 2016 2234");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String email, String customerName,
                       String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("You made a deposit of " + depositAmount +
                " Your new balance is " + this.balance);
    }

    public void withdraw (double withdrawalAmount){
        if(withdrawalAmount > this.balance){
            System.out.println(this.balance + " available. Insufficient Funds");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("You made a withdrawal of " + withdrawalAmount +
                    " your new balance is " + balance);
        }
    }
}
