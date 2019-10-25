import java.util.Scanner;

public class Main {

    private static Bank bank;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        startBankingApp();
        bank.AddNewBranch("Dublin");
        bank.addCustomer("Dublin", "Ben", 500);
        bank.addCustomer("Dublin", "John", 6);
        bank.addCustomer("Dublin", "Thomas", 340);

        bank.AddNewBranch("Portlaoise");
        bank.addCustomer("Portlaoise", "Nixon", 100_000);
        bank.addCustomer("Portlaoise", "Harry", 800);
        bank.addCustomer("Portlaoise", "Sophie", 11000);

        bank.addCustomerTransaction("Portlaoise", "Nixon", 20000);
        bank.addCustomerTransaction("Portlaoise", "Nixon", 200.50);
        bank.addCustomerTransaction("Portlaoise", "Nixon", 40.40);

        openBankingMenu();
        boolean quit = false;
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    option1();
                    break;

                case 2:
                    option2();
                    break;

                case 3:
                    option3();
                    break;

                case 4:
                    option4();
                    break;

                case 5:
                    openBankingMenu();
                    break;
            }

        }

    }



    private static void option4() {
        System.out.println("Enter the name of an existing branch: ");
        String branch = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the name of the customer: ");
        String customerName = scanner.nextLine();
        scanner.nextLine();
        bank.showTransactions(branch, customerName);
        return;
    }

    private static void option3() {
        System.out.println("Enter the name of an existing branch: ");
        String branch = scanner.nextLine();
        bank.listCustomers(branch);
        scanner.nextLine();
        return;
    }

    private static void option2() {
        System.out.println("Enter the branch name, customer name and the starting amount delimited by a comma (,):");
        scanner.useDelimiter(",|[\\r\\n]");
        String branch = scanner.next();
        String customerName = scanner.next();
        double amount = scanner.nextDouble();
        bank.addCustomer(branch, customerName, amount);
        scanner.nextLine();
        return;
    }

    private static void option1() {
        System.out.println("Enter the name of the new branch: ");
        String branchName = scanner.nextLine();
        bank.AddNewBranch(branchName);
        scanner.nextLine();
        return;
    }

    private static void startBankingApp() {
        System.out.println("Loading mobile banking.....\n" +
                "Enter your bank:");
        bank = new Bank(scanner.nextLine());
        return;
    }

    private static void openBankingMenu() {
        System.out.println("Welcome to " + bank.getName() + " mobile banking\n" +
                "Make a selection from the menu\n" +
                "0. Shutdown application\n" +
                "1. Add a branch\n" +
                "2. Add a customer\n" +
                "3. Print out list of customers in a branch\n" +
                "4. print out list of transactions for a customer\n" +
                "5. Open Banking Menu" +
                "");

    }
}
