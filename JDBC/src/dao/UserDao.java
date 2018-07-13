package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.User;
import ojdbc.DBConn;

public interface UserDao {

	// UserTB 전체 조회
	//	idx 정렬
	public List<User> selectAll();

	// idx를 이용한 UserTB 조회 - 1명
	public User selectByIdx(int idx);

	// User 삽입
	public void insertUser(User insertUser);

	// idx를 이용한 UserTb 삭제
	public void deleteByIdx(int idx);

}

class UserDaoEx{
	private Connection conn = DBConn.getConnection();

	public List<User> selectAll() {
		List<User> list = new ArrayList<>();
		String sql = "select * from User order by idx";

		Statement st; 
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while(rs.next()) {
				User user = new User();
				user.setIdx(rs.getInt("idx"));
				user.setName(rs.getString("name"));
				user.setUserid(rs.getString("userid"));
				list.add(user);
			}
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		return list;
	}
	
	public User selectByIdx(int idx) {
		User user = new User();
		String sql = "Select * from User where idx=idx";
		
		Statement st;
		
		try {
			st=conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	public void inserUser(User insertUser) {
		List<User> list = new ArrayList<>(); 
		String sql = "insert into User(idx, userid, name) "
				+ "values(user)";
		
		
	}
	
}


