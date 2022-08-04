import java.util.ArrayList;

// Create BankAccount Class
class BankAccount {

	// BankAccount attributes checking and savings balance
	private double checkings;
	private double savings;

	// class members Number of Accounts and Total
	public static int totalAccounts;
	public static double totalMoney;

	// Constructor: savings and checkings account
	public BankAccount(double checkings, double savings) {
		this.checkings = checkings;
		this.savings = savings;

		// increment number of accounts count
		BankAccount.totalAccounts++;
		BankAccount.totalMoney = this.checkings + this.savings;
	}

	// get checkings balance
	public double getCheckings() {
		return this.checkings;
	}

	// get savings balance
	public double getSavingsBalance() {
		return this.savings;
	}

	// method allows user to deposit money into checkings
	public double depositChecking(double amount) {
		BankAccount.totalMoney += amount;
		return this.checkings += amount;
	}

	// method allows user to deposit money into savings
	public double depositSaving(double amount) {
		BankAccount.totalMoney += amount;
		return this.savings += amount;
	}

	// method to withdraw from Checkings
	// returns insufficient if balance is less than amount balance
	public double withdrawChecking(double amount) {
		BankAccount.totalMoney -= amount;
		if (amount > this.checkings) {
			System.out.println("Insufficient funds");
			return this.checkings;
		} else {
			return this.checkings -= amount;
		}
	}

	// method to withdraw from Savings
	// returns insufficient if balance is less than amount balance
	public double withdrawSaving(double amount) {
		BankAccount.totalMoney -= amount;
		if (amount > this.savings) {
			System.out.println("Insufficient funds");
			return this.savings;
		} else {
			return this.savings -= amount;
		}
	}

	// method to see the total funds in BankAccount (both)
	public void BankTotal() {
		System.out.println(BankAccount.totalMoney);
	}

	// net balance
	public void netWorth() {
		System.out.println("Your total net balance is " + " " + (this.checkings + this.savings));
	}
}
