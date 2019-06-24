package cursoUdemyJavaII;

import java.util.Scanner;

public class EX002 {
	/*
	  Programa para ler um número inteiro e dizer se este número é par ou ímpar.
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.printf("Por favor, Digite um número: ");
		int num = ler.nextInt();
		
		if(num% 2 != 0) {
			System.out.println("IMPAR");
		} else {
			System.out.println("PAR");
		}
		ler.close();
	}

}
