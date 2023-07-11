package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProductRequest;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional(rollbackOn = Exception.class)
public class ProductService {

	// EmployeeRepositoryをインスタンス化
	// EmployeeRepositoryの実装(Implementation)はSpring Data JPAにより生成される
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getProductList() {
		// findAll()でemployeesテーブル全件取得
		List<Product> productList = productRepository.findAll();
		return productList;
	}

	public void create(ProductRequest productRequest) {
		Product product = new Product();
		product.setName(productRequest.getName());
		product.setPrice(Integer.parseInt(productRequest.getPrice()));
		productRepository.save(product);
	}

	public Product getProduct(int id) {
		return productRepository.findById(id).get();
	}

	public void update(ProductRequest productRequest) {
		Product product = new Product();
		product.setName(productRequest.getName());
		product.setId(productRequest.getId());
		product.setPrice(Integer.parseInt(productRequest.getPrice()));
		productRepository.save(product);
		
	}

	public ProductRequest convetProductRequest(Product product){
		ProductRequest productRequest = new ProductRequest();
		productRequest.setId(product.getId());
		productRequest.setName(product.getName());
		productRequest.setPrice(String.valueOf(product.getPrice()));
		return productRequest;
	}
		

}