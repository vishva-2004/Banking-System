package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSql {
		public static Connection getConnections() throws SQLException	{
			String url ="jdbc:mysql://localhost:3306/bankingapp";
			String name ="root";
			String password="Dhanush2295@";
			return DriverManager.getConnection(url,name,password);
	}
}
