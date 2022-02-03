package u.objectMethods;

public class ElectricityBill {

	int meterNo;
	String name;
	String address;
	
	public ElectricityBill() {
	}

	public ElectricityBill(int meterNo, String name, String address) {
		this.meterNo = meterNo;
		this.name = name;
		this.address = address;
	}
	
	public int getMeterNo() {
		return meterNo;
	}
	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Electricity Bill Information" + "\n" +
			   "Meter No: " + this.getMeterNo() + "\n" +
			   "Name: " + this.getName() + "\n" +
			   "Address: " + this.getAddress();
	}
	
	@Override
	public boolean equals(Object obj) {
		ElectricityBill bill = (ElectricityBill) obj;
		
		if(bill.getMeterNo() == this.getMeterNo()) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.getMeterNo();
	}
}
