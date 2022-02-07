package w.enums;

public class TestPayment {
	
	public static void main(String[] args) {
		
		PaymentType pt = PaymentType.CREDITCARD;
		System.out.println("Payment used: " + pt);
		
		PaymentType[] paymentTypes = PaymentType.values();
		System.out.println("Payment Types:");
		for (PaymentType paymentType : paymentTypes) {
			System.out.print("Payment Id: " + paymentType.ordinal() + ",");
			System.out.print("Payment type: " + paymentType + ",");
			System.out.println("Payment fee: " + paymentType.getFee());

		}
	}
	

}
