package consumindoBiblioteca;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnviaEmail {

	static void enviaEmail(String destinatario, String assunto, String mensagem) throws EmailException {
		Email enviaemail = new SimpleEmail();
		enviaemail.setHostName("smtp.googlemail.com");
		enviaemail.setSmtpPort(465);
		enviaemail.setAuthenticator(new DefaultAuthenticator("diegosilva.sena7", "santosfc2016"));
		enviaemail.setSSLOnConnect(true);
		enviaemail.setFrom("diegosilva.sena7@gmail.com");
		enviaemail.setSubject(assunto);
		enviaemail.setMsg(mensagem);
		enviaemail.addTo(destinatario);
		enviaemail.send();
		
		System.out.println("Seu e-mail foi encaminhado, verifique a caixa de entrada...");
	}
}
