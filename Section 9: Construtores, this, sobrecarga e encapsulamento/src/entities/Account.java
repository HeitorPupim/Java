package entities;

public class Account {
	
	// private attributes, we need to create getters and setters.
	//number can't be changed once the account is created.
	private int number;
	//people can change name due to marriage, for eg.
	private String holder;
	
	//balance only changes if there is a deposit or withdraw, so we'll only get.
	private double balance;
	
	//if there's no initial deposit.
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	// if there's an initial deposit.
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
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
		return "Account "
				+ number
				+", Holder: "
				+ holder 
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
