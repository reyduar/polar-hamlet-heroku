package ar.com.webapp.polarhamlet.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.webapp.polarhamlet.models.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Serializable> {

	public abstract User findByUsername(String username);
}
