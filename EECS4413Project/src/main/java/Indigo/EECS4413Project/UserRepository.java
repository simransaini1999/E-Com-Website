package Indigo.EECS4413Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByID(int id);
	
	
	@Query(value = "SELECT password FROM users WHERE username = ?1",nativeQuery = true)
	String findbyUsername(String username);


	@Modifying
    @Transactional
    @Query("UPDATE User u SET u.password = :password WHERE u.username = :username")
	void update(String username, String password);

}
