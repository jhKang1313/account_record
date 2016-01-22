package to_do_for_me;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		DataDAO dataDAO = new DataDAO(new MySQLConnectionMaker());		
	}
}
