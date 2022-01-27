package j.abstraction;

public class TestLaptop {

	public static void main(String[] args) {
		
		HPNotebook hpNotebook = new HPNotebook();
		hpNotebook.click();
		hpNotebook.scroll();
		
		DELLNotebook dellNotebook = new DELLNotebook();
		dellNotebook.click();
		dellNotebook.scroll();
	}
}
