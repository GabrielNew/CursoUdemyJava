package cursoUdemyJavaIV;

import java.util.Scanner;

public class EX003 {
	/*
	 Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
	 de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
	 conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
	 peso 5. 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int qtd = ler.nextInt();
		
		for (int i=0;i < qtd; i++) {
			float n1 = ler.nextFloat();
			float n2 = ler.nextFloat();
			float n3 = ler.nextFloat();
			
			float media = ((n1*2) + (n2*3) + (n3*5)) / 10;
			
			System.out.printf("%.1f%n", media);
		}
		
		ler.close();
	}

}
