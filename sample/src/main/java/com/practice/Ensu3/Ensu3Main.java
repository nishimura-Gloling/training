package com.practice.Ensu3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Ensu3Main {
	public static void main(String[] args) throws SQLException {

		// DBに接続
		Connection con = Ensu3Service.connectDB();
		
		// 子供の男性の情報を取得
		List<User> userChildMaleList = Ensu3Service.getChildMaleList(con);
		// 子供の男性をコンソールに表示
		System.out.println("<<<<<<<子供の男性は>>>>>>>");
		Ensu3Service.display(userChildMaleList);

		// 大人女性の情報を取得
		List<User> userAdultFemaleList = Ensu3Service.getAdultFeMaleList(con);
		// 大人女性をコンソールに表示
		System.out.println("<<<<<<<子供の男性は>>>>>>>");
		Ensu3Service.display(userAdultFemaleList);
		
		con.close();
	}
}
