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

	// UserTB ��ü ��ȸ
	//	idx ����
	public List<User> selectAll();

	// idx�� �̿��� UserTB ��ȸ - 1��
	public User selectByIdx(int idx);

	// User ����
	public void insertUser(User insertUser);

	// idx�� �̿��� UserTb ����
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


