import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseTestClass {

	public static void main(String[] args) {

		Connection con = null;
		String conUrl = "jdbc:sqlserver://Rabbihasan\\SQLEXPRESS:1433; databaseName=HumanResource; user=sa; password=Rabbihasan1995;";

		try {
			// ...
			con = DriverManager.getConnection(conUrl);
			System.out.println("Connection Successful");

			// ...
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
				}
		}
	}

}
