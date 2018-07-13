package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.Emp;
import ojdbc.DBConn;

public class EmpDao { 
	
	// DB ���� ��ü
	private Connection conn = DBConn.getConnection();
	
	public List<Emp> getList() { 
		List<Emp> list = new ArrayList<>();
		
		String sql = "select * from emp";
		
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			// ��� ó��
			// rs�� list�� �ű��
			while( rs.next() ) {
				Emp emp = new Emp(); 
				emp.setEmpno(rs.getInt("empno")); 
				emp.setHiredate(rs.getDate("hiredate")); //��¥�ޱ� 
				
				list.add(emp); 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list; 
	} 
	
	public void insertEmp(Emp emp) {
		
	}
	
	public void updateEmp(Emp emp) { 
		
	}

}
