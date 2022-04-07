package com.shakil.dao;

import java.sql.*;

public class LoginDao {
	public boolean check_user(String username, String password) {
		String sql = "select * from user_info where Email=? and pass=?";
		String url = "jdbc:mysql://localhost:3306/login";
		String db_uname = "root";
		String db_password = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, db_uname, db_password);
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, username);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}
}
