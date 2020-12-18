package entitiesBanck;

public class Account {

	private String holder;
	private int accountNumber;
	private double balance;

	public Account(String holder, int accontNumber) {
		this.holder = holder;
		this.accountNumber = accontNumber;
	}

	public Account(String holder, int accontNumber, double initialDeposit) {
		this.holder = holder;
		this.accountNumber = accontNumber;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccontNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Account Holder: "+holder
				+"\nAccount Number "+accountNumber
				+String.format("\nAccount Balance: %.2f",balance);
	}
}
