package u.objectMethods;

public class TestElectricityBill {
	
	public static void main(String[] args) {
		
		ElectricityBill bill1 = new ElectricityBill(69780, "John Doe", "123 Main St");
		ElectricityBill bill2 = new ElectricityBill(67445, "Gary Hart", "688 Windy Ln");
		ElectricityBill bill3 = new ElectricityBill(69780, "Jack Smith", "122 Melrose Pl");
		
		System.out.println(bill1);
		
		System.out.print("Is bill1 and bill2 the same? ");
		System.out.println(bill1.equals(bill2));
		System.out.print("Is bill1 and bill3 the same? ");
		System.out.println(bill1.equals(bill3));
		
		System.out.println("Hashcode for bill1:" + bill1.hashCode());
	}

}
