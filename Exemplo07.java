package Projetos_LPA.aula05;

import java.util.Scanner;

public class Exemplo07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("informe o número: ");
		numero= ler.nextInt();

		if (numero > 10 ) {
			System.out.println("O número é maior que 10");
		}
		ler.close();
	}

}
