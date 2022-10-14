package com.yash.jdbcmvc.jdbccrud.serviceImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.jdbcmvc.jdbccrud.service.ProductService;
import com.yash.jdbcmvc.jdbccrud.util.JDBCUtil;

import org.apache.log4j.Logger;

/*
* Implementation of service Method
*/
public class ProductServiceImpl implements ProductService {
	static Logger logger = Logger.getLogger(ProductServiceImpl.class.getClass());

	// Method implementation for insertion of data

	public void save(int id, String Name, double price) {

		PreparedStatement ps = JDBCUtil.prepareStatement("insert into product(id,name,price) value(?,?,?)");

		try {
			ps.setInt(1, id);
			ps.setString(2, Name);
			ps.setDouble(3, price);

			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		logger.info("Successfully inserted");

	}
	// Method implementation for deletion of data

	public void delete(String Name) {
		PreparedStatement ps = JDBCUtil.prepareStatement("delete from product where name=?");
		try {
			ps.setString(1, Name);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// Method Implementation for retriving all product data
	public void getProductList() {

		PreparedStatement ps = JDBCUtil.prepareStatement("select * from product");

		try {
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				logger.info("ID " + rs.getInt(1));
				logger.info("Name " + rs.getString(2));
				logger.info("Price " + rs.getString(3));
			}
			ps.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// Method Implementation for Product data update
	public void updateProduct(int price, int Id) {
		PreparedStatement ps = JDBCUtil.prepareStatement("update product set price=? where id=?");

		try {
			ps.setInt(1, price);
			ps.setInt(2, Id);
			int i = ps.executeUpdate();
			logger.info("Number of rows affected " + i);
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
