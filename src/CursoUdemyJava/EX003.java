package CursoUdemyJava;

import java.util.Scanner;

public class EX003 {
	
	/*
	 Programa para ler quatro valores inteiros A, B, C e D. Depois calcule e mostre a diferença do produto
	 de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). 
	*/
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		int d = ler.nextInt();
		
		int diferenca = (a*b - c*d);
		
		System.out.println("Diferença: " + diferenca);
		
		ler.close();
	}

}
