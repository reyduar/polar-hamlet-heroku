package ar.com.webapp.polarhamlet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.com.webapp.polarhamlet.models.Product;
import ar.com.webapp.polarhamlet.repositories.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	@Qualifier("productRepository")
	private ProductRepository productRepository;
	
	@Override
	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product removeProduct(Product product) {
		productRepository.delete(product);
		return product;
	}

}
