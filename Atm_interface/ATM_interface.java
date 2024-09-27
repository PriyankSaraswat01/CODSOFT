package Atm_interface;

public class ATM_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount userAccount = new BankAccount(500);

        // Create an ATM object with the user's bank account
        ATM atm = new ATM(userAccount);

        // Show the ATM menu
        atm.showMenu();

	}

}
