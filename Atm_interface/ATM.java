package Atm_interface;

		import java.util.Scanner;

		public class ATM {
		    private BankAccount account;

		    // Constructor that initializes the ATM with a user's bank account
		    public ATM(BankAccount account) {
		        this.account = account;
		    }

		    // Method to show options and interact with the user
		    public void showMenu() {
		        Scanner scanner = new Scanner(System.in);
		        boolean running = true;

		        while (running) {
		            System.out.println("\n--- ATM Menu ---");
		            System.out.println("1. Check Balance");
		            System.out.println("2. Deposit");
		            System.out.println("3. Withdraw");
		            System.out.println("4. Exit");
		            System.out.print("Please select an option: ");
		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    checkBalance();
		                    break;
		                case 2:
		                    deposit(scanner);
		                    break;
		                case 3:
		                    withdraw(scanner);
		                    break;
		                case 4:
		                    running = false;
		                    System.out.println("Thank you for using the ATM. Goodbye!");
		                    break;
		                default:
		                    System.out.println("Invalid option. Please try again.");
		            }
		        }
		        scanner.close();
		    }

		    // Method to check balance
		    public void checkBalance() {
		        System.out.println("Your current balance is: $" + account.checkBalance());
		    }

		    // Method to deposit money
		    public void deposit(Scanner scanner) {
		        System.out.print("Enter the amount to deposit: $");
		        double amount = scanner.nextDouble();
		        account.deposit(amount);
		    }

		    // Method to withdraw money
		    public void withdraw(Scanner scanner) {
		        System.out.print("Enter the amount to withdraw: $");
		        double amount = scanner.nextDouble();
		        account.withdraw(amount);
		    }
		
	}

