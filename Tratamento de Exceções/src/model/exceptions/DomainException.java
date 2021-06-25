package model.exceptions;

/*
 * Nesta classe estamos criando nossa exception personalizada, as exceptions deve ter herança
 * de alguma classe de extenção do Java, neste caso estamos utilizando a Exception que obriga
 * que realizamos a tratativa das exceções em nosso código, ao usarmos a clesse RuntimeException
 * ela não nos trás a obrigação de tratarmos os possíveis erros.
 */
public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	//Construtor com responsabilidade de emitir uma msg para a superclasse (Exception) 
	public DomainException(String msg) {
		super(msg);
	}
}