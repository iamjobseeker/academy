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
	
	// DB 연결 객체
	private Connection conn = DBConn.getConnection();
	
	public List<Emp> getList() { 
		List<Emp> list = new ArrayList<>();
		
		String sql = "select * from emp";
		
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			// 결과 처리
			// rs를 list로 옮기기
			while( rs.next() ) {
				Emp emp = new Emp(); 
				emp.setEmpno(rs.getInt("empno")); 
				emp.setHiredate(rs.getDate("hiredate")); //날짜받기 
				
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
