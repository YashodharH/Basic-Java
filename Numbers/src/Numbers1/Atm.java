package Numbers1;

public class Atm {

	public static void main(String[] args) {
		System.out.println("Main method started");
		double accountBalance = 500.00;
		double amount = 600.00;
		if (amount < accountBalance) {
			System.out.println("Withdraw Success");
			accountBalance = accountBalance - amount;
		}else {
			System.out.println("Withdraw Failed");
			System.out.println("Insufficient balance, Try later");
	}
		System.out.println("account Balance " +accountBalance);
		System.out.println("Program Ended");
	}
	
}
