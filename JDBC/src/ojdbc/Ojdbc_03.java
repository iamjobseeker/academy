package ojdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ojdbc_03 {
	public static void main(String[] args) {
		
		Connection conn = DBConn.getConnection(); // DB¿¬°á
		
		Statement st = null;
		ResultSet rs = null;
		
		String sql = "select * from dept";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	

}
