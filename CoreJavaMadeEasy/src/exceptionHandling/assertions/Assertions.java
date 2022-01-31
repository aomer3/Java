package m.exceptionHandling.assertions;

public class Assertions {
	
	public static void main(String[] args) {
		
		int widthdrawlAmount = 100;
		int currentBalance = 100;
		
		assert(widthdrawlAmount < currentBalance):"Withdrawal amount is more than current balance";
	}

}
