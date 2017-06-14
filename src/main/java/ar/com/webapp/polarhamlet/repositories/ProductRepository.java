package ar.com.webapp.polarhamlet.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.webapp.polarhamlet.models.Product;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Serializable>{

	
}
