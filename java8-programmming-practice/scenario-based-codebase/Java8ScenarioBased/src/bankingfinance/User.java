package bankingfinance;

public class User {
	private long accountId;
	private String accountNumber;
	private String accoundHolderName;
	private double amount;
	
	public User(long accountId, String accountNumber, String accoundHolderName, double amount) {
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.accoundHolderName = accoundHolderName;
		this.amount = amount;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccoundHolderName() {
		return accoundHolderName;
	}

	public void setAccoundHolderName(String accoundHolderName) {
		this.accoundHolderName = accoundHolderName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "User [accountId=" + accountId + ", accountNumber=" + accountNumber + ", accoundHolderName="
				+ accoundHolderName + ", amount=" + amount + "]";
	}
}
