package DB;

class Connection 
{
	public static Connection getConnections()	{
		String url ="jdbc:Mysql://localhost:3306/bankingapp";
		String name ="noconnection";
		String password="Dhanush2295@";
		return DriverManager.getConnection(url,name,pass);
	}
}