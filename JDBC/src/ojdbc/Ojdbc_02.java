package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ojdbc_02 {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger"; 
	
	public static void main(String[] args) {
		
		// ����̹� �ε� 
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null; // DB���ᰴü 	
		Statement st = null; // SQL���ఴü 
		ResultSet rs = null; // ��ȸ ��� ��ü
		
		String createTbSql = "CREATE TABLE USERTEST ("
				+ " no number primary key, "
				+ " name varchar2(20) not null,"
				+ " phone varchar2(40) not null )"; 
		
		String createSqSql = "create sequence seq_test"
				+ " increment by 1"
				+ " start with 1"; 
		
		String sql = ""; // sql�� ���� �ۼ� 
		
		try {
			// DB ���� 
			con = DriverManager.getConnection(url, USERNAME, PASSWORD);
			
			// Statement ��ü ���
			st = con.createStatement();
			
			// Query ���� 
			st.execute(createTbSql); // TB ����
			st.execute(createSqSql); // SEQ ����    
			
			rs = st.executeQuery("select count(*) cnt from tabs"
					+ " where table_name='USERTEST'");  
			rs.next();
			
			if ( rs.getInt("cnt") > 0 ) {
				System.out.println("���̺� ���� �Ϸ�"); 
			}
			
		} catch (SQLException e) {
			e.printStackTrace(); 
		}
		
	}

}
