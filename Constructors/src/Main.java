public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount bobsAccount = new BankAccount();
        //BankAccount bobsAccount = new BankAccount("12344", 0.00, "harry@google.com", "harry", "(089) 453 2922");
        bobsAccount.withdraw(100.00);

        bobsAccount.deposit(50);
        bobsAccount.withdraw(100.00);

        bobsAccount.deposit(51);
        bobsAccount.withdraw(100);

        BankAccount timsAccount = new BankAccount("tim", "tim@email.com", "1234");
        System.out.println(timsAccount.getAccountNumber());

    }
}
