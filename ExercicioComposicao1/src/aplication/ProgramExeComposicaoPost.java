package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class ProgramExeComposicaoPost {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Instanciando objeto do tipo Comment
		Comment c1 = new Comment("Have a nice trip!!!");
		Comment c2 = new Comment("Whw that's awesome!!!");
		
		//Instanciando objeto do tipo Post, com data formatada e texto inserido.
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		
		//Adicionando comeários
		p1.addComment(c1);
		p1.addComment(c2);
		
		//Instanciando objeto do tipo Comment
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		
		//Instanciando objeto do tipo Post, com data formatada e texto inserido.
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		
		//Adicionando comeários
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println("Post 1: " + p1);
		System.out.println("-------------- \n");
		System.out.println("Post 2: " + p2);
	}
}
