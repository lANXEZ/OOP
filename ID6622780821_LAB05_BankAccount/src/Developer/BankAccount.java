package Developer;

public class BankAccount {
	public static int numAccount = 0;
	private String ownerName;
	private double balance;
	private String accountNumber;

	public BankAccount(String ownerName,  String accountNumber, double balance) {
		this.ownerName = ownerName;
		this.setBalance(balance);
		this.setAccountNumber(accountNumber);
		numAccount++;
	}

	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		System.out.println("Deposit: $" + amount);

	}

	void withdraw(double amount) {
		if (getBalance() > amount) {
			setBalance(getBalance() - amount);
			System.out.println("Withdraw: $" + amount);
		} else {
			System.out.println("Not enough balance!");
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	void printInfo() {
		System.out.println("Info");
	}
}
