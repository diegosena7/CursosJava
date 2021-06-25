package consumindoBiblioteca;

import org.apache.commons.mail.EmailException;

public class UsandoLibEmail {

	public static void main(String[] args) throws EmailException {
		
		EnviaEmail.enviaEmail("diego.tjdosantos@gmail.com", "Teste envia e-mail com lib", "Enviando e-mail com lib.");
	}
}
