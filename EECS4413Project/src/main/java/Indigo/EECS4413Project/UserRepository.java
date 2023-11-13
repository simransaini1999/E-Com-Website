package Indigo.EECS4413Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.PathParam;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByID(int id);
	
	
	@Query(value = "SELECT password FROM users WHERE username = ?1",nativeQuery = true)
	String findbyUsername(String username);


	@Modifying
    @Transactional
	@Query(value = "UPDATE users SET password = :password WHERE username = :username", nativeQuery = true)
	void update(@PathParam("username") String username, @PathParam("passowrd") String password);

}


//UPDATE users SET password = ? WHERE username = ?