package exercicios;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Informe mum número inteiro entre 0 e 100: ");
       int n = scanner.nextInt();
       
       if (n >= 0 && n <= 100) {
    	   System.out.println((n%2==1 || (n>=6 && n<=20)) ? "Weird" : "Not Weird");
	}else {
		System.out.println("Informe um número válido (entre 0 e 100).");
	}
       
//       if(n%2==1 || (n>=6 && n <= 20)){
//    	   ans = "Weird";
//    	   System.out.println(ans);
//    	 }else{
//    	   ans = "Not Weird";
//    	   System.out.println(ans);
//    	 }
        scanner.close();
    }
}
