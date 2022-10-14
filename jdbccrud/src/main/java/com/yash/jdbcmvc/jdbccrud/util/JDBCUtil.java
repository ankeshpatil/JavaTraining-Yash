package com.yash.jdbcmvc.jdbccrud.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtil {
	public static PreparedStatement prepareStatement(String sql) {
		PreparedStatement preparedStatement=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/productdb";
			Connection con=DriverManager.getConnection(url,"root","root");
			 preparedStatement=con.prepareStatement(sql);
			
		
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		return preparedStatement;
		
		
	}

}
;