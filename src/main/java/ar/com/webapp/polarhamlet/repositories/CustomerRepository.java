package ar.com.webapp.polarhamlet.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.webapp.polarhamlet.models.Customer;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Serializable>{

	public abstract Customer findById(Integer id);
	
}
