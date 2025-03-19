package Projetos_LPA.aula05;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		String frase = "Olá mundo";
		String frase1 = frase.substring(0, 9); 
		int tamanho = frase.length();
		char letra = frase1.charAt(8); 
		
		
		// Instaciar class Scanner
		Scanner ler = new Scanner(System.in);
		
		// Entrada de dados
		System.out.println("Informe a frase");
		frase = ler.nextLine();
		
		System.out.println("Posição caractere: ");
         frase1 = ler.nextLine();

		System.out.println("O tamanho é: " + tamanho);
	}

}

		
		
		
		

	}

}
