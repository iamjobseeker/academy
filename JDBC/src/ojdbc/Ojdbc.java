package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC, Java DataBase Connection �����
// 1. JDBC ����̹� �ε�
// 2. DB ����(Connection)
// 3. SQL ���� ����
// 4. ��� ó��
// 5. ���� ���� 

public class Ojdbc {
	public static void main(String[] args) {

		// OJDBC ����̹� �ε� 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		}
		
		Connection con = null; // DB���� ��ü
		Statement st = null; // SQL�� ���� ��ü
		ResultSet rs = null; // ��ȸ��� ��ȯ ��ü 
		
		try {
			// DB ����
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
			
			// SQL ���� Ŭ����
			// Statement �Ǵ� Prepared Statement - DB�� ������ �����ִ� ���� 
			st = con.createStatement();  // ��� ���� �� �ִ� Stream�� �ش� 
			
			// SQL ���� �޼ҵ�
			// execute
			// executeUpdate 
			// executeQuery - SELECT 
			
			rs = st.executeQuery("select * from emp order by empno"); // �����ϰ� ����ޱ� 
			
//			List<Emp> emp; // ������� �� �����
			
			// ��ȸ ��� ó���ϱ�
			while (rs.next() ) { // next - ��ȸ�� �࿡ ���� ������ 
				System.out.print(rs.getString("empno")); // �÷������� ��ȸ�ϱ� 
				System.out.print(","+rs.getString("ename")); 
				System.out.print(","+rs.getString("job"));
				System.out.print(","+rs.getString("mgr"));
				System.out.print(","+rs.getString("hiredate"));
				System.out.print(","+rs.getString(6)); // �÷���ȣ�� ��ȸ�ϱ�
				System.out.print(","+rs.getString(7));
				System.out.println(","+rs.getString(8)); 
			}
				
			// SQL ������ �޴� Ŭ���� (SELECT�� ��쿡��)
			// ResultSet 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		

	}

}
