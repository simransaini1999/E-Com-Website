package Indigo.EECS4413Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.ws.rs.core.MediaType;


@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginDAO loginDAO = new LoginDAO();

	@GetMapping(value = "/{username}/{password}",produces = MediaType.APPLICATION_JSON)
	public boolean authenticator(@PathVariable String username,@PathVariable String password) {
		return loginDAO.read(username, password);

	}

	@PatchMapping(value = "/{username}/{newPassword}",produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<String> updatePassword(@PathVariable String username, @PathVariable String newPassword) {

        try {
            loginDAO.update(username, newPassword);
            System.out.println(username + newPassword);
            return ResponseEntity.ok("Password updated successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error updating password.");
        }
    }
}
