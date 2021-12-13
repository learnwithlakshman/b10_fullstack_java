package com.careerit.scart.dao;

import java.util.List;

import com.careerit.scart.domain.Product;

public interface ProductDao {
		List<Product> selectProducts();
}
