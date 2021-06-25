package entitie;

public class Register {

	public int account;
	public String name;
	public double balance;
	
	public Register() {
		
	}
	public Register(int account, String name) {		
		this.account = account;
		this.name = name;
	}

	public Register(int account, String name, double balance) {		
		this.account = account;
		this.name = name;		
		this.balance = balance;
	}
	
	public int getAccount() {
		return account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	
	public double deposit (double value) {
		return balance += value;
	}
	public double withdraw (double value) {
		return balance = balance - value - 5;
	}
	public String toString () {
		return "Account "+ account +
				", Holder: "+ name +
				", Balance: $"+ String.format("%.2f", balance);
	}
}
