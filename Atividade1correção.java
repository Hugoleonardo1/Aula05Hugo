package Projetos_LPA.aula05;

import java.util.Scanner;

public class Atividade1correção {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma string: ");
		String frase = ler.nextLine();
            
        // Imprimir o tamanho da string
        System.out.println("Tamanho da string: " + frase.length());
        
        //Obter o caractere na posição informada pelo usuário
        System.out.println("Digite a posição do caractere que deseja obter: ");
        int posicao = ler.nextInt();
        char caractere = frase.charAt(posicao);
        System.out.println("Caractere na posição " + posicao + ": " + caractere);
        
        // Verificar se a string é igual a "Olá mundo!"
        if(frase.equals("Olá mundo")) {
        	System.out.println("São iguais");
        }
        ler.close();
	}

}
