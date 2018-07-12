package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	private static Connection conn = null; // null. Ŀ�ؼ� ���� �� �̷���� 
	
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger"; 
	
	public static Connection getConnection() { // DB���� �޼ҵ�
		
		// DB������ �̷������ �ʾ������� ���� 
		// �������� ȣ���� ���� 
		if(conn == null) {
			try {
				Class.forName(DRIVER); // ����̹��ε�
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD); // DB���ᰴü ����
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return conn; // conn�� ����~���ᵿ�� �ϳ��� ��ü�� ������ ���� 
	}
		
	}
	
