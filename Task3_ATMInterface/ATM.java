import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Transaction failed.");
            return false;
        } else {
            balance -= amount;
            System.out.printf("₹%.2f withdrawn successfully.\n", amount);
            return true;
        }
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return false;
        } else {
            balance += amount;
            System.out.printf("₹%.2f deposited successfully.\n", amount);
            return true;
        }
    }

    public void checkBalance() {
        System.out.printf("Current Balance: ₹%.2f\n", balance);
    }
}

public class ATM {
    private static Scanner scanner = new Scanner(System.in);
    private static BankAccount account;

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM Interface");
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        double initialBalance;

        while (true) {
            System.out.print("Enter Initial Balance: ₹");
            if (scanner.hasNextDouble()) {
                initialBalance = scanner.nextDouble();
                if (initialBalance >= 0) {
                    break;
                } else {
                    System.out.println("Balance cannot be negative.");
                }
            } else {
                System.out.println("Please enter a valid amount.");
                scanner.next(); 
            }
        }

        account = new BankAccount(name, initialBalance);
        System.out.println("\nAccount Created Successfully for " + account.getAccountHolder());

        boolean continueSession = true;
        while (continueSession) {
            showMenu();
            int choice = getValidChoice();

            switch (choice) {
                case 1:
                    performWithdraw();
                    break;
                case 2:
                    performDeposit();
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for using our ATM.");
                    continueSession = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select from the menu.");
            }
            System.out.println(); 
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n======= ATM MENU =======");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Choose an option (1-4): ");
    }

    private static int getValidChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number between 1 and 4: ");
            scanner.next(); 
        }
        return scanner.nextInt();
    }

    private static void performWithdraw() {
        System.out.print("Enter amount to withdraw: ₹");
        if (scanner.hasNextDouble()) {
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("Invalid amount.");
            scanner.next(); 
        }
    }

    private static void performDeposit() {
        System.out.print("Enter amount to deposit: ₹");
        if (scanner.hasNextDouble()) {
            double amount = scanner.nextDouble();
            account.deposit(amount);
        } else {
            System.out.println("Invalid amount.");
            scanner.next();
        }
    }
}
