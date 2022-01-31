package n.multithreading;

public class SingleThreaded {
	
	//Single-threaded application = sequence is sequential after printNumber()finishes, 
	// only then does main start
	public static void main(String[] args) {
		
		SingleThreaded st = new SingleThreaded();
		st.printNumber();
		
		for (int j = 0; j < 200; j++) {
			System.out.print("blue: " + j + " ");
		}
		
	}
	
	void printNumber() {
		for (int i = 0; i < 200; i++) {
			System.out.print("red: " + i + " ");
		}
	}

}
