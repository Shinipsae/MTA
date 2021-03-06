package q42;

public class Q42 extends Account{
	double rate = 0.02;
	
	Q42(double startingBalance){
		super(startingBalance);
	}

	public static void main(String[] args) {
		Q42 q = new Q42(1000);
		System.out.println(q);
	}
	
	@Override
	public String toString() {
		return String.format("Savings Current Balance: $%.2f", 
				this.getBalance());
	}

}

class Account{
	private double balance;

	public Account(double startingBalance) {
		System.out.println("생성자 실행");
	}
	
	public double getBalance() {
		return balance;
	}
	
}
