package com.careerit.scart.service;

import java.util.List;

import com.careerit.scart.dao.ProductDao;
import com.careerit.scart.dao.ProductDaoImp;
import com.careerit.scart.domain.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	public ProductServiceImpl() {
		productDao = new ProductDaoImp();
	}

	@Override
	public List<Product> getProducts() {
		List<Product> list = productDao.selectProducts();
		System.out.println("Total product count is :"+list.size());
		return list;
	}

}
