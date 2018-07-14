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
		
		// 드라이버 로드 
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null; // DB연결객체 	
		Statement st = null; // SQL수행객체 
		ResultSet rs = null; // 조회 결과 객체
		
		String createTbSql = "CREATE TABLE USERTEST ("
				+ " no number primary key, "
				+ " name varchar2(20) not null,"
				+ " phone varchar2(40) not null )"; 
		
		String createSqSql = "create sequence seq_test"
				+ " increment by 1"
				+ " start with 1"; 
		
		String sql = ""; // sql문 따로 작성 
		
		try {
			// DB 연결 
			con = DriverManager.getConnection(url, USERNAME, PASSWORD);
			
			// Statement 객체 얻기
			st = con.createStatement();
			
			// Query 수행 
			st.execute(createTbSql); // TB 생성
			st.execute(createSqSql); // SEQ 생성    
			
			rs = st.executeQuery("select count(*) cnt from tabs"
					+ " where table_name='USERTEST'");  
			rs.next();
			
			if ( rs.getInt("cnt") > 0 ) {
				System.out.println("테이블 생성 완료"); 
			}
			
		} catch (SQLException e) {
			e.printStackTrace(); 
		}
		
	}

}
