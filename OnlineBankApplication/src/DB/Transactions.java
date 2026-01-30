package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Transactions {

	public static Scanner sc = new Scanner(System.in);
	public static void Account_creation() throws SQLException
	{
		Connection con = ConnectionSql.getConnections();
	}
	
	
	public static void withrawal() throws SQLException
	{
		Connection con = ConnectionSql.getConnections();
		String qury ="select * from accounts where account_no=?;";
		PreparedStatement pre = con.prepareStatement(qury);
		pre.setInt(1, sc.nextInt());
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
