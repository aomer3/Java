package f.flowcontrol;

public class LabeledBlock {
	
	public static void main(String[] args) {
		
		int x=20;
		
		//Labeled blocks are rarely used in real time applications
		l1:
		{
			System.out.println("Block begins");
			if(x == 20) {
				break l1;
			}
			System.out.println("Block ends");
		}
		
		System.out.println("Outside the block");
	}

}
