import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnector {
	
	//public static Connection;
	public static Connection  conn() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false","Monyeseala1#", "martin"); 
			}
			catch(Exception e) {
				System.out.println("Cannot access the database");
			}
		return null;
	}

}