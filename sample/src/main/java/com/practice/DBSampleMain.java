package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exmple.enshu.Product;
import com.exmple.enshu.ProductService;

public class DBSampleMain {
	public static void main(String[] args) throws SQLException {

		// 接続オブジェクトの定義
		Connection con = null;
		// 接続先情報を表す文字列の定義
		String url = "jdbc:mysql://127.0.0.1:3306/demo";
		// 接続時に使用するユーザー名の定義
		String user = "root";
		// 接続時に使用するパスワードの定義
		String password = "root";
		
		List<Product> productList = new ArrayList<Product>();
		try {
			con = DriverManager.getConnection(url, user, password);
			PreparedStatement stmt = null;
			stmt = con.prepareStatement("SELECT * FROM products where price  <=200");
			ResultSet res = stmt.executeQuery();

			while (res.next()) {
				Product product = new Product();
				product.setName(res.getString("name"));
				product.setPrice(res.getInt("price"));
				productList.add(product);
			}
//
//			for(int i = 0 ; i < productList.size() ; i++ ) {
//				Product product = productList.get(i);
//				System.out.println(product.getName() +":"+product.getPrice());				
//			}

			for(Product product: productList) {
				System.out.println(product.getName() +":"+product.getPrice());				
			}

			res.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();	
			throw e;
		}
	}
}
