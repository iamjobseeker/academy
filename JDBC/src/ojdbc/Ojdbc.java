package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC, Java DataBase Connection 사용방법
// 1. JDBC 드라이버 로드
// 2. DB 연결(Connection)
// 3. SQL 쿼리 수행
// 4. 결과 처리
// 5. 연결 종료 

public class Ojdbc {
	public static void main(String[] args) {

		// OJDBC 드라이버 로드 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		}
		
		Connection con = null; // DB연결 객체
		Statement st = null; // SQL문 수행 객체
		ResultSet rs = null; // 조회결과 반환 객체 
		
		try {
			// DB 연결
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
			
			// SQL 수행 클래스
			// Statement 또는 Prepared Statement - DB에 쿼리를 보내주는 역할 
			st = con.createStatement();  // 명령 내릴 수 있는 Stream을 준다 
			
			// SQL 수행 메소드
			// execute
			// executeUpdate 
			// executeQuery - SELECT 
			
			rs = st.executeQuery("select * from emp order by empno"); // 수행하고 결과받기 
			
//			List<Emp> emp; // 결과담을 행 만들기
			
			// 조회 결과 처리하기
			while (rs.next() ) { // next - 조회할 행에 대한 포인터 
				System.out.print(rs.getString("empno")); // 컬럼명으로 조회하기 
				System.out.print(","+rs.getString("ename")); 
				System.out.print(","+rs.getString("job"));
				System.out.print(","+rs.getString("mgr"));
				System.out.print(","+rs.getString("hiredate"));
				System.out.print(","+rs.getString(6)); // 컬럼번호로 조회하기
				System.out.print(","+rs.getString(7));
				System.out.println(","+rs.getString(8)); 
			}
				
			// SQL 수행결과 받는 클래스 (SELECT일 경우에만)
			// ResultSet 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		

	}

}
