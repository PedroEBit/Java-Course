package entities;

public class Account {

	private String acc_holder;
	private int acc_number;
	private float balance;
	
	public Account(int acc_number, String acc_holder, float balance) {
		this.acc_holder = acc_holder;
		this.acc_number = acc_number;
		this.balance = balance;
	}

	public Account(int acc_number, String acc_holder) {
		super();
		this.acc_holder = acc_holder;
		this.acc_number = acc_number;
	}

	public String getAcc_holder() {
		return acc_holder;
	}

	public int getAcc_number() {
		return acc_number;
	}

	public double getFirst_deposit() {
		return balance;
	}

	public String toString() {
		return  "Account "
				+ acc_number
				+ ", Holder: "
				+ acc_holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

	public void deposit(float f) {
		balance += f;
	}

	public void withdraw(float i) {
		balance -= i;
	}

}
