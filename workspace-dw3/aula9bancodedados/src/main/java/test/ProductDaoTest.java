package test;

import java.sql.Connection;

import connection.ConnectionFactory;
import models.Product;
import repository.IProductRepository;
import repository.ProductRepository;

public class ProductDaoTest {
	IProductRepository repository;
	
	public ProductDaoTest() {
		this.repository = new ProductRepository();
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		ProductDaoTest test = new ProductDaoTest();
		// test.insertTest();
		// test.deleteTest();
		test.updateTest();
		
		
		
	}
	
	private void insertTest() {
		Product p = new Product();
		
		p.setName("produto 1");
		p.setPrice(99.0);
		p.setDescription("Product description");
		p.setImageUri("src/image");
		
		repository.insert(p);
	}
	
	public void deleteTest() {
		repository.deleteById(6);
	}
	
	public void updateTest() {
		Product p = new Product();
		
		p.setId(5);
		p.setName("produTOP");
		p.setPrice(99.0);
		p.setDescription("Product descripTOP");
		p.setImageUri("src/image");
		
		repository.update(p);
	}
	
}
