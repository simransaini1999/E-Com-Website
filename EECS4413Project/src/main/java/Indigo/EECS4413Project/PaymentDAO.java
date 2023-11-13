package Indigo.EECS4413Project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class PaymentDAO {
	@Autowired
	UserRepository userrepo;

	public User read(int id){
		return userrepo.findByID(id);

	}

}
