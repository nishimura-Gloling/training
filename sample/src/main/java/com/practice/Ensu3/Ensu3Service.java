package com.practice.Ensu3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Ensu3Service {

	public static Connection connectDB() throws SQLException {
			// 接続オブジェクトの定義
			Connection con = null;
			// 接続先情報を表す文字列の定義
			String url = "jdbc:mysql://127.0.0.1:3306/demo2";
			// 接続時に使用するユーザー名の定義
			String user = "root";
			// 接続時に使用するパスワードの定義
			String password = "root";
			con = DriverManager.getConnection(url, user, password);
			return con ;
	}	
	
	public static List<User> getChildMaleList(Connection con) throws SQLException{
		PreparedStatement stmt = null;
		stmt = con.prepareStatement("SELECT * FROM users where age < 20 and sex = 1");
		ResultSet res = stmt.executeQuery();

		List<User> userAdultFeMaleList = getUserList(res);
		res.close();
		stmt.close();
		return userAdultFeMaleList;
	}
	
	
	public static List<User> getAdultFeMaleList(Connection con) throws SQLException{
		PreparedStatement stmt = null;
		stmt = con.prepareStatement("SELECT * FROM users where age >= 20 and sex = 2");
		ResultSet res = stmt.executeQuery();

		List<User> userAdultFeMaleList = getUserList(res);
		res.close();
		stmt.close();
		return userAdultFeMaleList;
	}
	
	
	private static List<User> getUserList(ResultSet res) throws SQLException{
		List<User> userList = new ArrayList<User>();

		while (res.next()) {
			User user = new User();
			user.setId(res.getInt("id"));
			user.setName(res.getString("name"));
			user.setSex(res.getInt("sex"));
			user.setAge(res.getInt("age"));
			userList.add(user);
		}
		return userList;
	}

	public static void display(List<User> userList) {
		for (User user : userList) {
			System.out.println(user.getName());
		}
	}
}
