package a.nonStaticMembers;

public class BankAccount {
	
	// If any fields are common across objects, that field should be defined as static
	// Static variables = stored in method area
	// When class is destroyed, static variables will be destroyed
	static String bankName = "Bank of America";
	
	// Any fields unique to the object should be assigned as instance fields (non-static variables)
	// Instance variables = stored in heap
	// When object is destroyed, instance variables will be destroyed
	String accountHoldersName;
	String accountNumber;
	float balance;
	
	public static void main(String[] args) {
		
		/*
		Local variables are variables inside of a method 
		Local variables = stored in stack
		
		Where as static and instance variables have default values, local variables 
	    will not be initialized by default. Program will throw an error instead.
		
		When method is finished, the local variable is destroyed 
		*/
		double loanInterestRate = 7.5;
		
		System.out.println(BankAccount.bankName);
		
		BankAccount ba = new BankAccount();
		ba.accountHoldersName = "John";
		ba.accountNumber = "123123123";
		ba.balance = 20000f;
		
		System.out.println(ba.balance);
		System.out.println(loanInterestRate);
	}

}
