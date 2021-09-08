package Work;

public class Account {
	private int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;

	int getBalance() {
		return balance;
	}

	void setBalance(int balance) {
		if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
			return;
		} else {
			this.balance = balance;
		}

	}
}
