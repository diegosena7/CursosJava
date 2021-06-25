package model.exceptions;

/*
 * Nesta classe estamos criando nossa exception personalizada, as exceptions deve ter heran�a
 * de alguma classe de exten��o do Java, neste caso estamos utilizando a Exception que obriga
 * que realizamos a tratativa das exce��es em nosso c�digo, ao usarmos a clesse RuntimeException
 * ela n�o nos tr�s a obriga��o de tratarmos os poss�veis erros.
 */
public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	//Construtor com responsabilidade de emitir uma msg para a superclasse (Exception) 
	public DomainException(String msg) {
		super(msg);
	}
}