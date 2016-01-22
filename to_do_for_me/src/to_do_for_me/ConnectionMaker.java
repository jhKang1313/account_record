package to_do_for_me;

import java.sql.SQLException;
import java.sql.*;

public interface ConnectionMaker {
	public Connection getConnection() throws ClassNotFoundException, SQLException;
}
