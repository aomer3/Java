package b.datatypes;

public class DataTypes {
	
	byte a = -50;
	short $_c = 150;
	int c007 = 10000;
	long Mou$_e = 100000;
	
	char e = 'A';
	
	float f= 1.23f;
	double g = 12345.6789;
	
	byte h = 20;
	
	//When you add two bytes, the sum is defaulted to int. Must be typecasted to use byte
	byte result = (byte) (a+h);
	
	public static void main(String[] args) {
		
		DataTypes dt = new DataTypes();
		System.out.println(dt.result);
	}
	

}
