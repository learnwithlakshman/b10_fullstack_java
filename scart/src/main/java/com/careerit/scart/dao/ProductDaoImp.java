package com.careerit.scart.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.careerit.scart.dao.util.ConnectionUtil;
import com.careerit.scart.domain.Product;

public class ProductDaoImp implements ProductDao {

	private final String GET_PRODUCTS = "select pid,name,price,description from product";

	@Override
	public List<Product> selectProducts() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<Product> list = new ArrayList<>();
		try {
			con = ConnectionUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(GET_PRODUCTS);
			while (rs.next()) {
				long pid = rs.getLong("pid");
				String name = rs.getString("name");
				String description = rs.getString("description");
				float price = rs.getFloat("price");
				Product product = new Product();
				product.setDescription(description);
				product.setProductId(pid);
				product.setPrice(price);
				product.setName(name);
				list.add(product);
			}
		} catch (Exception e) {
			System.out.println("While getting products :" + e);
		} finally {
			ConnectionUtil.close(rs, st, con);
		}

		return list;
	}

}
