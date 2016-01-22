package to_do_for_me;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.*;
public class MySQLConnectionMaker implements ConnectionMaker{
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/account","root", "wlsgur1313");  
		return connection;
	}
}

