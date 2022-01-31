package n.multithreading;

public class SleepMethod extends Thread {
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.print("red: " + i + " ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("SleepMethod thread existing");
			}
		}
	}
	
	public static void main(String[] args) {
		
		SleepMethod sm = new SleepMethod();
		sm.start();
		
		for (int j = 0; j < 3; j++) {
			System.out.print("blue: " + j + " ");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Main thread exisitng");
			}
		}
		
	}

}
