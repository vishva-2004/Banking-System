package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Transactions {

	public static void Account_creation() throws SQLException
	{
		Connection con = ConnectionSql.getConnections();
		
		
	}
	
	
	public static void withrawal() throws SQLException
	{
		Connection con = ConnectionSql.getConnections();
		String qury ="select * from users;";
		PreparedStatement pre = con.prepareStatement(qury);
		ResultSet rs =pre.executeQuery();
		 while (rs.next()) 
		 {
	            System.out.println(rs.getInt(1) + " " + rs.getString(2));
	     }
	 }
	
	public static void main(String[] args) throws SQLException {
		withrawal();

	}

}
