package cursoUdemyJavaIV;

import java.util.Scanner;

public class EX007 {
	/*
	 Criar um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
	 começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor. 
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n = ler.nextInt();
		
		for (int i=1; i<=n; i++) {
			int quad = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);
			
			System.out.printf("%d %d %d%n", i, quad, cubo);
		}
		
		ler.close();
	}

}
