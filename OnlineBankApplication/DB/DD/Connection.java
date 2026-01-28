package DD;

import java.sql.DriverManager;
import java.sql.SQLException;

class Connection 
{
	public static java.sql.Connection getConnections() throws SQLException	{
		String url ="jdbc:Mysql://localhost:3306/bankingapp";
		String name ="noconnection";
		String password="Dhanush2295@";
		return DriverManager.getConnection(url,name,password);
	}
}