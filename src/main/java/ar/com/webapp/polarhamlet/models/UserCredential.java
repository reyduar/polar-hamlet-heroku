package ar.com.webapp.polarhamlet.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCredential {

	private String username;
	private String password;
		
}
