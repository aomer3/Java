package q.innerclasses.anonymousInnerClass;

public class DriverManager {
	
	static Connection getConnection() {
		Connection con = new Connection() {

			@Override
			public void createStatement() {
				System.out.println("Anonymous Inner Classes method");
			}
			
		};
		
		return con;
	}

}
