package w.enums;

//A program that charges no fee for using credit card, $5 fee for using a debit card, and
//$10 for using cash
public enum PaymentType {
	DEBITCARD(5), CREDITCARD(0), CASH(10);
	
	int fee;
	
	private PaymentType(int fee) {
		this.fee = fee;
	}
	
	public int getFee() {
		return this.fee;
	}

}
