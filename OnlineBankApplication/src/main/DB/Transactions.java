package DB;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transactions {

	public static void widrawal() throws SQLException
	{
		Connection con = Connection.getConnections();
		String qury ="select * from users;"; 
		PreparedStatement pr = con.preparedStatement(qury);
		pr.execute();
	}
	public static void main(String[] args)throws SQLException {
		widrawal();

	}

}
