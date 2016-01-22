package to_do_for_me;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DataDAO {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	public DataDAO(ConnectionMaker connectionMaker) throws ClassNotFoundException, SQLException{
		this.connection = connectionMaker.getConnection();
	}

}
