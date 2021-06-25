package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Toda vez que estivermos tabalhando com listas não devemos usar get e set para o objeto List
 * devemos criar métodos de adição e remoção do objeto.
 */
public class Post {
	
	/*Criamos o sdf do tipo static para não precisarmos instanciar todas as vezes o mesmo objeto
	 * e podemos usar em outras partes da aplicação
	 */
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();

	//Construtor sem parâmetros
	public Post() {
	}

	//Construtor com parâmetros
	public Post(Date moment, String title, String content, Integer likes) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	//Getters and Setters
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	//Método responsável por adicionar um comentário
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	//Método responsável por remover um comentário
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	//To string com append, transforma os os dados do objeto em String.
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		
		//Para cada comentário estamos inserindo o comentário no getText 
		for(Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}	
}
