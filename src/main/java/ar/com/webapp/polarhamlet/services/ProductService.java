package ar.com.webapp.polarhamlet.services;

import java.util.List;

import ar.com.webapp.polarhamlet.models.Product;

public interface ProductService {
	
	public abstract List<Product> getProducts();
	public abstract Product saveProduct(Product product);
	public abstract Product removeProduct(Product product);
	public abstract Product updateProduct(Product product);
}
